RutaMatch

Descripción

**RutaMatch** es una aplicación desarrollada en Java orientada a la gestión y organización de viajes compartidos entre usuarios.

El proyecto busca proporcionar una estructura para gestionar diferentes tipos de usuarios dentro del sistema, principalmente **pasajeros y conductores**, así como la información relacionada con los viajes.

El desarrollo del proyecto utiliza una arquitectura organizada por paquetes, separando el **modelo de datos** de la **interfaz gráfica**, con el propósito de facilitar el mantenimiento, evolución y escalabilidad de la aplicación.

---

Objetivo del proyecto

El objetivo de RutaMatch es desarrollar una aplicación que permita gestionar información relacionada con:

Usuarios.
Conductores.
Pasajeros.
Viajes.
Fechas y horarios de los viajes.
Cupos disponibles.
Estado de los viajes.

El proyecto se encuentra en desarrollo y su lógica de negocio puede evolucionar a medida que se incorporan nuevos requerimientos.

---

Funcionalidades

Actualmente el proyecto cuenta con una estructura inicial para:

Gestión de usuarios

La clase `Usuario` representa la entidad base de los usuarios del sistema.

Contiene información como:

* ID del usuario.
* Nombre.
* Correo electrónico.
* Teléfono.
* Contraseña.
* Estado.

`Usuario` está definida como una clase abstracta para permitir la creación de diferentes tipos de usuarios.

Conductores

La clase `Conductor` hereda de `Usuario` y agrega información específica del conductor:

* Todo lo que tenga que ver con la  licencia.

Pasajeros

La clase `Pasajero` hereda de `Usuario` y representa a los usuarios que participan como pasajeros dentro de la aplicación.


Interfaz gráfica

El proyecto cuenta con una interfaz gráfica desarrollada mediante **Java Swing**, representada principalmente por:

`GUIPrincipal.java`

La interfaz constituye la capa de presentación de la aplicación.

---

 Arquitectura del proyecto

El proyecto utiliza una organización basada en paquetes, separando las responsabilidades principales.

```text
RutaMatch
│
├── src
│   └── main
│       └── java
│           └── com
│               └── mycompany
│                   └── rutamatch
│                       │
│                       ├── RutaMatch.java
│                       │
│                       ├── modelo
│                       │   ├── Usuario.java
│                       │   ├── Pasajero.java
│                       │   ├── Conductor.java
│                       │   └── Vehiculo.java
│                       │
│                       └── view
│                           ├── GUIPrincipal.java
│                           └── GUIPrincipal.form
│
├── pom.xml
└── README.md
```

`modelo`

Contiene las clases que representan las entidades principales del sistema.

```text
modelo/
├── Usuario.java
├── Pasajero.java
├── Conductor.java
└── Vehiculo.java
```

`view`

Contiene los elementos relacionados con la interfaz gráfica.

```text
view/
├── GUIPrincipal.java
└── GUIPrincipal.form
```

`RutaMatch.java`

Es la clase principal de la aplicación y contiene el método `main()` utilizado para iniciar el programa.

`pom.xml`

Contiene la configuración del proyecto Maven, incluyendo:

* Identificación del proyecto.
* Versión.
* Codificación.
* Versión de Java.
* Clase principal de ejecución.

---

Modelo de clases

La relación principal entre las clases de usuario se representa de la siguiente manera:

```text
                 Usuario
                <<abstract>>
                    ▲
              ┌─────┴─────┐
              │           │
          Pasajero     Conductor
                            │
                         licencia
```

`Usuario` funciona como clase base y permite compartir atributos comunes entre pasajeros y conductores.

---

 Tecnologías utilizadas

| Tecnología     | Uso                                  |
| -------------- | ------------------------------------ |
|Java         | Lenguaje principal de programación   |
|Maven       | Gestión y configuración del proyecto |
|Java Swing | Desarrollo de la interfaz gráfica    |
|NetBeans    | Entorno de desarrollo utilizado      |
|Git         | Control de versiones                 |
|GitHub      | Repositorio y colaboración           |

---

 Requisitos

Para ejecutar el proyecto se recomienda contar con:

* **Java JDK 24** o una versión compatible con la configuración actual del proyecto.
* **Apache NetBeans**.
* **Apache Maven**.
* **Git**, si se desea trabajar con el repositorio.

---

Instalación

1. Clonar el repositorio

```bash
git clone https://github.com/yaritxaduarte-arch/RutaMatch.git
```

2. Entrar al proyecto

```bash
cd RutaMatch
```

3. Abrir el proyecto

Abrir la carpeta del proyecto desde **Apache NetBeans**.

NetBeans reconocerá el proyecto como un proyecto Maven debido a la presencia del archivo:

```text
pom.xml
```

4. Ejecutar

Desde NetBeans se puede ejecutar el proyecto utilizando:

```text
Run Project
```

o mediante el botón de ejecución ▶️.

La aplicación inicia desde:

```java
com.mycompany.rutamatch.RutaMatch
```

---

🔄 Estado del desarrollo

El proyecto se encuentra actualmente **en desarrollo**.

Las funcionalidades y la arquitectura pueden modificarse conforme se incorporen nuevos requerimientos de la lógica de negocio.

Entre las próximas etapas de desarrollo se contempla continuar con la implementación de la lógica de negocio 
y las operaciones necesarias para la gestión de las entidades del sistema.

---

Próximos pasos

Mejorar la interfaz gráfica.
Documentar la arquitectura definitiva del proyecto.

---

Control de versiones

El proyecto utiliza **Git** para el control de versiones y **GitHub** como plataforma para almacenar y compartir el código fuente.

Se recomienda trabajar mediante ramas para desarrollar nuevas funcionalidades sin afectar directamente la rama principal.

Ejemplo:

```bash
git checkout -b nombre-de-la-funcionalidad
```

Después de realizar los cambios:

```bash
git add .
git commit -m "Descripción de los cambios"
git push origin nombre-de-la-funcionalidad
```

---

Equipo de desarrollo

**Proyecto:** RutaMatch

**Tecnología principal:** Java

**Gestión del código:** Git / GitHub

---

Licencia

Este proyecto fue desarrollado con fines **académicos**.

© 2026 RutaMatch

