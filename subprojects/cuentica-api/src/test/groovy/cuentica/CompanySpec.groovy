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
