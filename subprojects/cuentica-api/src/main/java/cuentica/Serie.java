package cuentica;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;

public class Serie {
    @Nonnull
    private String name;

    @JsonProperty("default")
    boolean defaultSerie;

    public Serie() {
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    public boolean isDefaultSerie() {
        return defaultSerie;
    }

    public void setDefaultSerie(boolean defaultSerie) {
        this.defaultSerie = defaultSerie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Serie serie = (Serie) o;

        if (defaultSerie != serie.defaultSerie) return false;
        return name.equals(serie.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (defaultSerie ? 1 : 0);
        return result;
    }
}
