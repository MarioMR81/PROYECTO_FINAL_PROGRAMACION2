# PROYECTO_FINAL_PROGRAMACION2

Mario Quiñonez 7690-21-2086 Programacion 2 Universidad Mariano Galvez Facultad de Ingenieria en Sistemas 

# Descripccion
Acontinuacion Veremos una breve explicacion a traves de un manual de usuario o documentacion sobre el uso adecuado de el programa realizado, como descripcion veremos el desarrollo de una Pagina Web con distintas funcionalidades entre ellas el poder utilizar una base de datos para almacenar comentarios y luego publicarlos en distintos articulos los cuales fueron tomados de el New York Times para tener una mayor variedad al igual se presentaran distintas opciones de uso las cuales ayuedaran a tener una interación directa con la pagina web, entre las cuales son tener una information general, consultar los articulos los cuales se actualizan, dejar comentarios y publicarlos, por ultimo la lista de los comentarios la cual se alamacenara en una base de datos para llevar un registro adecuado dentro del programa realizado en Intellij y dentro de la pagina web taqmbien ahora veamos la funcionalidad de cada opcion.


# MANUAL DE USUARIO
![4](https://user-images.githubusercontent.com/91577396/198782298-d4f57cce-33c9-4589-99da-c7d9bcd0a950.jpg)

# Indice


1....Introducción

Ahora podremos conocer mas sobre algunos puntos muy importantes del programa, para conocer a profundidad las distintas opciones como funcionan y cual es su mayor utilidad dentro del programa o pagina web todo esto implementado en un manual tecnico con algunos objetivos, pasos sobre el funcionamiento, soluciones de algunos problemas que se pueden presentar si la pagina web en conjunto con el programa y base datos no son ejecutados o manejados de una manera correcta, explicado paso por paso con la finalidad de lograr el mayor potencial de dicho programa para conocer distintas noticias que se pueden presentar en nuestro dia a dia y como funcionan dichas noticias en conjunto con sus comentarios

   ![3](https://user-images.githubusercontent.com/91577396/198792837-5792f375-1a20-4c7f-bfe6-8bd44a2c94db.jpeg)

2....Objetivos

Entender el funcionamiento de una base de datos en conjunto con HTML y JavaScript, la conectividad que puede existir entre ambos al crear una aplicacion, lo importante que puede ser el almacenar datos dentro de una Base de datos para luego poder presentarlos sin modificar los datos y en su maxima funcionalidad, ademas de tener registro dentro de una aplicacion con el simple hecho de saber como conectar una base de datos con diferentes lenguajes de programacion.

Conocer como funciona una pagina web a nivel mundial ya que se puede decir que se ha tomado como referencia la pagina del New York times para presentar sus articulos con un cierto orden y comentarlos todo esto para saber como hoy en dia funcionan las paginas web al igual como funcionan al momento de ingresar datos en ellas y como presentarlos.

Reconer el manejo de tablas, consultas, orden, etc. Dentro de una Base de datos para presentar datos en cualquier momento que sean requeridos por el usuario tambien como almacenar esos datos, incluso el manejo de una base de datos dentro de una pagina web y asi mismo su programacion.

Brindar el conocimiento sobre el como pueden funcionar en armonia el lenguaje HTML en conjunto con las base de datos y ademas el lenguaje que se utilice para conectar estos puntos muy importantes tambien el reconocer como diseñar una pagina web desde cero utilizando o no un framework para el diseño o con tan solo programa en un simple index desde cero sin utilizar apoyo sobre el material externo ambos recursos utilizados y presentados.

3....Descripcion de Uso de las funciones del Programa

Acontinuacion veremos algunas funciones muy importantes dentro del programa pero veamos el inicio como sabemos el proyecto o pagina web debio ser publicado utilizando un servidor, el que se utilzo a continuacion fue el servido de tomcat el cual ayudo a publicar la pagina web dentro de un local Host.

![5](https://user-images.githubusercontent.com/91577396/198808924-add01de5-fb61-42fd-8a50-5ac1fa2939df.png)

Al momento de estar publicado del proyecto y tener acceso a la pagina web principal se presentaran las siguientes opciones las cuales tendran una funcionalidad especifica tomando en cuenta y posiblemente las mas importante el consultar noticias ya que todo surge a traves de esta ventana, al momento de presionar una opcion como se puede ver en la pantalla se redireccionara a otra pestaña de la misma pagina principal, tendremos tres opcciones:
1 Informacion incial automatico
2 Consultar las noticias
3 Top generado de los tres articulos con mas comentarios

![image](https://user-images.githubusercontent.com/91577396/198812193-0dff0551-884c-4496-8d69-0aaf5f657eb8.png)

Como siguiente punto tendremos la primera opcion que seria el presentar la informacion inicial dependiendo que informacion ingresemos dentro del programa se puede presentar en esta pestaña pues no tiene una gran utilidad dentro del programa como sabemos 

![image](https://user-images.githubusercontent.com/91577396/198812568-db0d66b7-401f-4db6-a95a-46be587190bd.png)

Luego podemos presenciar la opcion nuemero 2 la cual es consultar noticias y posiblemente la mas importante de las opciones como sabemos al momento de generar la base de datos esta guarda al menos 30 noticias de ultima hora del New York Times la cual esta al macenada en la base de datos veamos la informacion dentro de la base de datos

![image](https://user-images.githubusercontent.com/91577396/198812672-08348255-5bc5-4b9b-b097-d534357acf11.png)

Ahora veamos la opcion al momento de ingresar a la opcion de consultar noticias, como se puede ver se han agregado por lo menos 30 noticias del New York Times dentro de la pagina cada una ira actualizando segun el New York Times al igual se puede presenciar el autor, la descripcion del articulo.

![image](https://user-images.githubusercontent.com/91577396/198812933-104c00a4-12e8-4307-99c3-066acf7ed105.png)

Ahora al momento de ingresar a un articulo se redirecionara a otra pestaña la cual nos permitira leer el articulo y tambien ver una imagen en conjunto con el post de agregar un comentario el cual debe ser ingresado por el usuario, el comentario no posee un cierto limite de letras o palabras dentro del textbox, por lo que al momento de ingresar el comentario y tambien el nombre de la persona que ingresda el comentario debe de publicarlo

![image](https://user-images.githubusercontent.com/91577396/198813077-cf000f73-9d66-4d45-a610-087934f85871.png)

![image](https://user-images.githubusercontent.com/91577396/198813170-5b53b1fb-218a-44d3-95dd-ab4e6c039bbd.png)

Al momento de ingresar el comentario el usuario debe de ingresar su nombre y presionar el boton de Post comment el cual nos ayudara a ingresar el comentario no solamente dentro de la pagina web si no tambien en la base de datos ahora veamos en que afecta esto a las consultas.

![image](https://user-images.githubusercontent.com/91577396/198813203-0bb48f40-bf4c-4794-adde-ec128ab84b03.png)

Cuando presionamos nuestro boton de post comment y recargamos la pagina de igual manera debemos de regresar a la opcion de consultar articulo para que veamos como el articulo fue publicado ahi tambien

![image](https://user-images.githubusercontent.com/91577396/198813271-3ca80fb2-3c66-4e6c-9025-792afc186dd1.png)

Como podemos ver el articulo se ha creado dentro de la visualizacion de la tarjeta del articulo esto es la principal funcion al momento de crear un articulo, sobre como debemos de ingresarlo, como se debe de publicar y en donde apareceria dicho articulo dentro de consultas, ahora que hemos visto mas sobre las consultas veamos el ultimo punto que es el mostrar el top 3 de comentarios de los articulo, debemos de regresar a la pagina principal y seleccionar la opcion la cual deberia de desplegarnos los articulos que no solamente fueron publicados en la opcion 2 sino tambien en la base de datos.

![image](https://user-images.githubusercontent.com/91577396/198813381-552fa03d-bbf5-41fd-80bf-fa40a0bc3b1a.png)

4....Solucion de Algunos Problemas

Algunos de los problemas que se pueden presentar dentro de la pagina web es posiblementa la conexion de la base de datos con dicha pagina web al momento de ingresar un comentario o al momento de visualizar los articulos aunque se han realizado varias pruebas y es muy improbable si se siguen los pasos presentados en esta documentacion tambien incluso no siguiendo los pasos no es un problema recurrente pero siempre se recomienda ejecutar la base otra vez si este problema se presenta.

Tambien se debe recordar que la pagina debe ser utilizada de la manera mas adecuada para no sobrecargar las opciones que se presetan y sea utilizada en un nivel muy alto sin tener que estar recargando la pagina Web en cada momento o ingresando los comentarios a cada rato.

5....Contactos

Mario Quiñonez 7690-21-2086 Programacion 2 Universidad Mariano Galvez Facultad de Ingenieria en Sistemas 

6....Diagrama de Clases

![image](https://user-images.githubusercontent.com/91577396/198813831-b7eb5cdc-904d-4d0d-8090-7f69e3d8544d.png)
