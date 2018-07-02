package pl.javastart;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import pl.javastart.config.DbConfiguration;

/**
 * @author Kaja D.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DbConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}