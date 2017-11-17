package Pages

import geb.Page

class loginPage extends Page {
    static url = 'login/'
    static at = {title == "Login to TalentBank"}
    static content = {
        logo {$(".center-img img")}
        emailHeader {$(".form-group label", text:"Email")}
        emailTextBox {$('#email')}
        pwdHeader {$(".form-group label", text:"Password")}
        pwdTextBox {$("#password")}
        loginButton {$("#loginButton")}
    }
}
