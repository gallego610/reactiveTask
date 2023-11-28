Proyecto Programación Reactiva
<!-- TOC -->

* [Endpoints](#endpoints)
    * [GET /general/health](#get-generalhealth)

<!-- TOC -->

# Proyecto Programación Reactiva

Una estructura de al menos 4 entidades de un dominio definido por usted de forma particular,
recuerde explicar brevemente el dominio en el readme de su proyecto, las entidades deberán usar Lombok,
además de al menos 2 interfaces que aseguren acciones en común para las entidades creadas previamente (NO son las de los
repositorios).

Para todas las entidades, cree al menos operaciones de obtener todos los objetos y obtenerlos por Id, luego para
al menos uno de las entidades, cree todas las operaciones básicas, usando Mono y Flux.

Utilice una BD R2DBC con H2 para ingresar 10 registros en cada entidad.

Agregue endpoints de actuator para verificar el estado del Microservicio (mínimo el HealthCheck).

Agregue test unitarios para los controladores creados, recuerde además mantener una estructura minima de paquetes.

Compartir un repositorio de su herramienta preferida (GitHub, GitLab o Bitbucket) con su proyecto.

## Endpoints

### GET /general/health

### GET /clientes

### POST /clientes

### DELETE /clientes/{id}

### GET /producto

### POST /producto

### DELETE /producto/{id}

### GET /producto/categoria/{id}

### GET /venta

### POST /venta

### DELETE /venta/{id}

### GET /detalleVenta

### GET /detalleVenta/{id} -> findByIdVenta

### POST /detalleVenta

### DELETE /detalleVenta/{id}












