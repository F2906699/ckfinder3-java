package example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class IndexController {
    @RequestMapping("/")
    public void index(HttpServletResponse response) {
        // Redirect to CKFinder's samples.
    	// "ckfinder/static/samples/full-page-open.html" or  "/ckfinder/static/samples/index.html"
        response.setHeader("Location", "ckfinder/static/samples/full-page-open.html");
        response.setStatus(302);
    }
}