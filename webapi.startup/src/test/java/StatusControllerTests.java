import george.stoica.webapi.controller.HealthCheckController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created on 16/9/2018.
 */
//@SpringBootTest(properties = "test.port=123")
@RunWith(SpringRunner.class)
@WebMvcTest(HealthCheckController.class)
public class StatusControllerTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void TestStatusCall() throws Exception {
        mvc.perform(get("/health/status")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
