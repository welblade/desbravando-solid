package cotuba.application;

import cotuba.*;
import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.epub.GeradorEPUB;
import cotuba.pdf.GeradorPDF;

import java.nio.file.Path;
import java.util.List;

public class Cotuba {
    public void executa(String formato, Path diretorioDosMD, Path arquivoDeSaida) {
        var renderizador = new RenderizadorMDParaHTML();

        List<Capitulo> capitulos = renderizador.renderiza(diretorioDosMD);

        var ebook = new Ebook();
        ebook
                .setFormato(formato)
                .setArquivoDeSaida(arquivoDeSaida)
                .setCapitulos(capitulos);

        if ("pdf".equals(formato)) {
            var geradorPDF = new GeradorPDF();
            geradorPDF.gera(ebook);
        } else if ("epub".equals(formato)) {
            var geradorEPUB = new GeradorEPUB();
            geradorEPUB.gera(ebook);
        } else {
            throw new IllegalArgumentException("Formato do ebook inválido: " + formato);
        }
    }
}
