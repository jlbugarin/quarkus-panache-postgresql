package com.consultorjava.propietarios;

import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/propietarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PropietarioResource {

    @GET
    public List<PropietariosEntity> list() {
        
        List<PropietariosEntity> allPropietarios = PropietariosEntity.listAll();
        return allPropietarios;
    }

    @POST
    @Transactional
    public Response create(final PropietariosEntity prop) throws Exception {

        prop.id = null;
        

        prop.persist();

        return Response.status(Status.CREATED).entity(prop).build();

    }

    @DELETE
    @Transactional
    public List<PropietariosEntity> delete(PropietariosDTO prop) {

        PropietariosEntity.deleteById(prop.getId());
        return PropietariosEntity.listAll();
    }

    @PUT
    @Transactional
    public Response update(
            PropietariosDTO prop) {

        PropietariosEntity entidad = PropietariosEntity.findById(prop.getId());

        entidad.setNombres(prop.getNombres());
        entidad.setApellidos(prop.getApellidos());
        entidad.setEmail(prop.getEmail());
        entidad.setTipoDocumento(prop.getTipoDocumento());
        entidad.setNumDocumento(prop.getNumDocumento());
        entidad.setNumTelefono(prop.getNumTelefono());

        return Response.status(Status.CREATED).entity(prop).build();

    }

}
