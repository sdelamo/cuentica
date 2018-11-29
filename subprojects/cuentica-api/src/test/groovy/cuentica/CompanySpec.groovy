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
package cuentica

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import spock.lang.Requires
import spock.lang.Specification

class CompanySpec extends Specification {

    @Requires({ sys['cuentica.token']})
    void "a company can be fetched"() {
        given:
        Cuentica cuentica = new Cuentica(System.getProperty('cuentica.token'))

        when:
        HttpResponse<Company> response = cuentica.fetchCompany().blockingFirst()

        then:
        response.status() == HttpStatus.OK

        when:
        Company company = response.body()

        then:
        company.series.size() > 0

    }
}
