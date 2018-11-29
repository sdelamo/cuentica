/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
