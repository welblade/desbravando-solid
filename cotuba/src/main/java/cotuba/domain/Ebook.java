package cotuba.domain;

import java.nio.file.Path;
import java.util.List;

public class Ebook {
    private String formato;
    private Path arquivoDeSaida;
    private List<Capitulo> capitulos;

    public String getFormato() {
        return formato;
    }

    public Ebook setFormato(String formato) {
        this.formato = formato;
        return this;
    }

    public Path getArquivoDeSaida() {
        return arquivoDeSaida;
    }

    public Ebook setArquivoDeSaida(Path arquivoDeSaida) {
        this.arquivoDeSaida = arquivoDeSaida;
        return this;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public Ebook setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
        return this;
    }

    public boolean isUltimoCapitulo(Capitulo capitulo) {
        if (!this.capitulos.contains(capitulo)) {
            throw new IllegalArgumentException("Este capítulo não existe no ebook.");
        }
        return this.capitulos.get(this.capitulos.size() - 1)
                .equals(capitulo);
    }
}
