package service.com.burodecredito.consultas;

import com.burodecredito.consultas.BuroRequestDocument;
import com.burodecredito.consultas.BuroResponseDocument;
import com.burodecredito.consultas.BuroResponseDocument.BuroResponse;
import com.burodecredito.consultas.BuroServiceSkeleton;

import java.util.Random;

public class BuroServiceImpl extends BuroServiceSkeleton
{
    @Override
    public BuroResponseDocument buroOperation(BuroRequestDocument buroRequest)
    {
        BuroResponseDocument responseDocument = BuroResponseDocument.Factory.newInstance();
        BuroResponse response = responseDocument.addNewBuroResponse();

        String cliente = buroRequest.getBuroRequest().getCliente().getNombre();
        boolean goodClient = aprobado();
        if(goodClient)
            response.setMotivo("Se tiene buen historial crediticio con " + cliente);
        else
            response.setMotivo(cliente + " no puede recibir un credito");

        response.setAprobado(goodClient);
        return responseDocument;
    }

    private boolean aprobado()
    {
        return new Random().nextDouble() > 0.3;
    }
}
