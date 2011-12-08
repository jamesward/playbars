import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }

    @Test
    public void barTest() {
        Response addBarResponse = POST("/", APPLICATION_X_WWW_FORM_URLENCODED, "bar.name=foo");
        assertStatus(302, addBarResponse);
        Response listBarsResponse = GET("/bars.json");
        assertIsOk(listBarsResponse);
    }
    
}
