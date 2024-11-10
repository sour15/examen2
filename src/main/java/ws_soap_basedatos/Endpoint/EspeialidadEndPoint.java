package ws_soap_basedatos.Endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibetec.ws.objects.*;
import pe.edu.cibetec.ws_soap_basedatos.service.EspecialidadService;

@Endpoint
public class EspecialidadEndPoint {
    private static final String NAMESPACE_URI = "http://www.cibetec.edu.pe/ws/objects";

    @Autowired
    private EspecialidadService especialidadService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getListEspecialidadesRequest")
    @ResponsePayload
    public GetListEspecialidadesResponse getListEspecialidades(@RequestPayload GetListEspecialidadesRequest request) {
        return especialidadService.obtenerEspecialidades();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEspecialidadRequest")
    @ResponsePayload
    public GetEspecialidadResponse getEspecialidad(@RequestPayload GetEspecialidadRequest request){
        return especialidadService.obtenerEspecialidad(request.getIdEspecialidad());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postEspecialidadRequest")
    @ResponsePayload
