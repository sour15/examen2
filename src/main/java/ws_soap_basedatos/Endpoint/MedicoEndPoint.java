package ws_soap_basedatos.Endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibetec.ws.objects.*;
import pe.edu.cibetec.ws_soap_basedatos.service.MedicoService;

@Endpoint
public class MedicoEndPoint {
    private static final String NAMESPACE_URI = "http://www.cibetec.edu.pe/ws/objects";

    @Autowired
    private MedicoService medicoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getListMedicosRequest")
    @ResponsePayload
    public GetListMedicosResponse getListMedicos(@RequestPayload GetListMedicosRequest request) {
        return medicoService.obtenerMedicos();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse getMedico(@RequestPayload GetMedicoRequest request){
        return medicoService.obtenerMedico(request.getIdMedico());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postMedicoRequest")
    @ResponsePayload
    public PostMedicoResponse guardarMedico(@RequestPayload PostMedicoRequest request){
        return medicoService.guardarMedico(request);
    }
}
