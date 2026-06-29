# Sistema de Gestión de Pedidos
Una empresa de logística necesita desarrollar una aplicación para administrar los pedidos realizados por sus clientes.

Los datos de los pedidos se encuentran almacenados en un archivo de texto llamado pedidos.txt. Cada línea del archivo contiene la información necesaria para construir los objetos del sistema.

La empresa trabaja con distintos tipos de pedidos, cada uno con características y comportamientos particulares. Sin embargo, todos comparten información y funcionalidades comunes que deberán ser identificadas y modeladas correctamente.

## Archivo de Entrada
El archivo tendrá un formato similar al siguiente:
 
N;1001;Juan Perez;10;2500;Buenos Aires;3;true

U;1002;Maria Lopez;5;3200;24;ALTA;true

M;1003;Pedro Gomez;20;1800;15;10;ORO

I;1004;Ana Ruiz;8;5000;Chile;12;USD

N;1005;Carlos Lopez;15;2000;Cordoba;2;false
 
La primera posición identifica el tipo de pedido:

N → Nacional

U → Urgente

M → Mayorista

I → Internacional

El resto de los datos dependerá del tipo correspondiente y deberá ser interpretado por el sistema para construir los objetos necesarios.


## Tipos de Pedidos
### Pedido Nacional
Además de la información general, deberá contemplar información relacionada con el destino del envío y las condiciones de entrega dentro del país.

### Pedido Urgente
Además de la información general, deberá contemplar información relacionada con la prioridad del pedido y los tiempos comprometidos para su entrega.

### Pedido Mayorista
Además de la información general, deberá contemplar información relacionada con beneficios comerciales y descuentos asociados a compras por volumen.

### Pedido Internacional
Además de la información general, deberá contemplar información relacionada con el país de destino y los costos asociados a operaciones internacionales.

## Funcionalidades Comunes
### Todo pedido deberá permitir:

Calcular su importe base.

Calcular su importe final.

Obtener una descripción completa de sus características.

La forma de realizar estos cálculos dependerá del tipo de pedido.

## Funcionalidades Particulares
### Pedido Nacional
Debe poder determinar condiciones relacionadas con la entrega dentro del país, por ejemplo costos adicionales de envío o condiciones de entrega rápida.

### Pedido Urgente
Debe poder determinar condiciones relacionadas con la prioridad del pedido, por ejemplo si requiere atención especial o recargos por urgencia.

### Pedido Mayorista
Debe poder determinar condiciones relacionadas con descuentos y beneficios asociados a compras por volumen.

### Pedido Internacional
Debe poder determinar condiciones relacionadas con impuestos o gestiones necesarias para operaciones internacionales.

## Requerimientos Técnicos
La solución deberá:

Leer la información desde el archivo de texto.

Construir los objetos correspondientes.

Almacenar los pedidos en una estructura que permita búsquedas eficientes por código.

Aplicar correctamente los conceptos de Programación Orientada a Objetos.

Utilizar interfaces para separar responsabilidades.

Resolver los cálculos solicitados utilizando Streams.

Funcionalidades a Desarrollar


### Punto 1
Leer el archivo y cargar todos los pedidos en memoria.

### Punto 2
Mostrar todos los pedidos cargados.

### Punto 3
Solicitar un código por teclado y mostrar la información correspondiente al pedido encontrado.

Si el pedido no existe informar:

 
Pedido inexistente.
 
### Punto 4
Calcular e informar el importe total facturado por la empresa.

### Punto 5
Obtener e informar el pedido con mayor importe final.

### Punto 6
Mostrar todos los pedidos cuyo importe final supere un valor ingresado por teclado.

### Punto 7
Informar la cantidad de pedidos existentes por cada tipo.

Ejemplo:

Pedidos Nacionales: 5

Pedidos Urgentes: 3

Pedidos Mayoristas: 2

Pedidos Internacionales: 4
 
### Punto 8
Calcular el importe promedio de todos los pedidos.

### Punto 9
Mostrar los pedidos que requieran algún tratamiento especial según sus características particulares.

### Punto 10
Mostrar una descripción detallada de todos los pedidos utilizando polimorfismo.

## Consideraciones

Se evaluará especialmente el correcto uso de herencia, abstracción, polimorfismo e interfaces.

Se deberá identificar adecuadamente qué información y comportamientos son comunes a todos los pedidos y cuáles son específicos de cada tipo.

Se recomienda aplicar buenas prácticas de diseño orientado a objetos.

El sistema debe compilar y ejecutarse sin errores.

Los cálculos solicitados deberán resolverse utilizando Streams.
