package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void preCondition(){
        //if SignOut presents --->logout
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }
    }
    @Test
    public  void loginSuccessTest(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("ivan@gmail.com","In()123456!");
        app.getHelperUser().submitLogin();

        //Assert.assertEquals();
        //Assert.assertNotEquals();
        //Assert.assertTrue();
        //Assert.assertFalse();

        Assert.assertTrue(app.getHelperUser().isLogged());

    }
    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("mara@gmail.com", "Mmar123456$");
        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isLogged());
    }
}
