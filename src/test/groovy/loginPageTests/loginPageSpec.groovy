import Pages.loginPage
import Pages.homePage
import geb.spock.GebSpec

class loginPageSpec extends GebSpec{


    def "Log in to TalentBank Core"(){
        given:
        to loginPage
        waitFor {js.('document.readyState') == 'complete'}

        when:
        emailTextBox.value("Ruxin")
        pwdTextBox.value("Test1234")
        loginButton.click()

        then:
        sleep(3000)
        waitFor {js.('document.readyState') == 'complete'}
        at homePage

    }
}
