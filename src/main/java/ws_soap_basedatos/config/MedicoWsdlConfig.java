package ws_soap_basedatos.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class MedicoWsdlConfig {

    @Bean(name = "medicos")
    public DefaultWsdl11Definition medicoWsdl(XsdSchema medicoEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("medicosPort");
        wsdl11Definition.setLocationUri("/ws/medicos");
        wsdl11Definition.setTargetNamespace("http://www.cibetec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(medicoEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema medicoEsquema() {
        return new SimpleXsdSchema(
                new ClassPathResource("xsd/medico.xsd"));
    }
}
