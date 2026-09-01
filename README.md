# 🚗 RutaMatch

## 📌 Descripción

**RutaMatch** es una aplicación desarrollada en Java orientada a la gestión y organización de viajes compartidos entre usuarios.

El proyecto proporciona una estructura para gestionar diferentes tipos de usuarios dentro del sistema, principalmente **pasajeros y conductores**, así como los vehículos asociados a la aplicación.

El desarrollo del proyecto utiliza una arquitectura organizada por paquetes, separando el **modelo de datos**, los **controladores** y la **interfaz gráfica**, con el propósito de facilitar el mantenimiento, evolución y escalabilidad de la aplicación.

---

## 🎯 Objetivo del proyecto

El objetivo de RutaMatch es desarrollar una aplicación que permita gestionar información relacionada con:

* Usuarios.
* Conductores.
* Pasajeros.
* Vehículos.
* Licencias de conducción.
* Estados de los usuarios.
* Información relacionada con los vehículos.

El proyecto se encuentra en desarrollo y su lógica de negocio puede evolucionar a medida que se incorporen nuevos requerimientos.

---

## ✨ Funcionalidades

Actualmente el proyecto cuenta con una estructura para la gestión de las principales entidades del sistema.

### 👤 Gestión de usuarios

La clase `Persona` representa la información general asociada a las personas dentro del sistema.

Entre la información manejada se encuentra:

* Identificación.
* Nombre.
* Correo electrónico.
* Teléfono.
* Contraseña.
* Estado.

A partir de esta información se gestionan los diferentes tipos de usuarios de RutaMatch.

### 🧑‍✈️ Conductores

La clase `Conductor` representa a los usuarios que cumplen el rol de conductor.

El conductor contiene información relacionada con:

* Datos personales.
* Información de licencia.
* Estado del conductor.
* Información asociada a su actividad dentro del sistema.

La gestión de los conductores se realiza mediante:

```text
ControllerConductor
```

Este controlador se encarga de gestionar las operaciones correspondientes a los conductores.

### 🧑‍🤝‍🧑 Pasajeros

La clase `Pasajero` representa a los usuarios que participan como pasajeros dentro de la aplicación.

La gestión de los pasajeros se realiza mediante:

```text
ControllerPasajero
```

Este controlador permite centralizar las operaciones relacionadas con los pasajeros.

### 🚗 Vehículos

La clase `Vehiculo` representa los vehículos utilizados dentro del sistema.

La gestión de los vehículos se realiza mediante:

```text
ControllerVehiculo
```

Este controlador centraliza las operaciones relacionadas con los vehículos.

---

# 🎮 Controllers

Los **Controllers** constituyen una parte importante de la arquitectura del proyecto, ya que permiten separar la lógica de gestión de las entidades de la interfaz gráfica.

Actualmente el proyecto cuenta con los siguientes controladores:

```text
controller/
├── ControllerConductor.java
├── ControllerPasajero.java
└── ControllerVehiculo.java
```

### `ControllerConductor`

Se encarga de gestionar las operaciones relacionadas con la entidad `Conductor`.

Entre sus responsabilidades se encuentran las operaciones de:

* Crear conductores.
* Consultar conductores.
* Actualizar información de conductores.
* Eliminar conductores.
* Validar la información relacionada con los conductores.

### `ControllerPasajero`

Se encarga de gestionar las operaciones relacionadas con la entidad `Pasajero`.

Sus responsabilidades incluyen:

* Crear pasajeros.
* Consultar pasajeros.
* Actualizar información de pasajeros.
* Eliminar pasajeros.
* Validar la información correspondiente a los pasajeros.

### `ControllerVehiculo`

Se encarga de gestionar las operaciones relacionadas con la entidad `Vehiculo`.

Sus responsabilidades incluyen:

* Crear vehículos.
* Consultar vehículos.
* Actualizar información de vehículos.
* Eliminar vehículos.
* Validar la información de los vehículos.

Los Controllers permiten que la interfaz gráfica no tenga que manejar directamente toda la lógica relacionada con las entidades.

---

## 🔄 Operaciones CRUD

Los Controllers implementan la lógica necesaria para gestionar las entidades mediante operaciones **CRUD**:

| Operación  | Descripción                      |
| ---------- | -------------------------------- |
| **Create** | Crear un nuevo registro          |
| **Read**   | Consultar o listar registros     |
| **Update** | Actualizar información existente |
| **Delete** | Eliminar registros               |

Estas operaciones permiten administrar la información de conductores, pasajeros y vehículos.

---

## ⚠️ Manejo de errores y excepciones

El proyecto contempla el manejo de errores y excepciones para evitar que datos inválidos o situaciones inesperadas interrumpan la ejecución de la aplicación.

Entre las validaciones consideradas se encuentran:

* Datos obligatorios.
* Identificadores válidos.
* Registros inexistentes.
* Registros duplicados.
* Información incorrecta.
* Operaciones sobre elementos que no existen.

El manejo de excepciones permite proporcionar mensajes de error adecuados y mantener una ejecución controlada del sistema.

---

# 🏗️ Arquitectura del proyecto

El proyecto utiliza una organización basada en paquetes para separar las responsabilidades principales:

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
│                       ├── controller
│                       │   ├── ControllerConductor.java
│                       │   ├── ControllerPasajero.java
│                       │   └── ControllerVehiculo.java
│                       │
│                       ├── modelo
│                       │   ├── Persona.java
│                       │   ├── Pasajero.java
│                       │   ├── Conductor.java
│                       │   ├── Vehiculo.java
│                       │   └── IActualizable.java
│                       │
│                       └── view
│                           ├── GUIPrincipal.java
│                           ├── GUIPrincipal.form
│                           │
│                           └── components
│                               ├── ButtonRenderer.java
│                               └── TableOptionsHelper.java
│
├── pom.xml
└── README.md

RutaMatch utiliza una estructura basada en el patrón MVC:

![Diagrama MVC](docs/diagrama-mvc.png)
```

---

## 📂 Paquete `modelo`

El paquete `modelo` contiene las clases que representan las entidades y estructuras principales del sistema.

```text
modelo/
├── Persona.java
├── Pasajero.java
├── Conductor.java
├── Vehiculo.java
└── IActualizable.java
```

### `Persona.java`

Representa la información general de una persona dentro del sistema.

### `Pasajero.java`

Representa a los usuarios que utilizan el sistema como pasajeros.

### `Conductor.java`

Representa a los usuarios que participan como conductores.

### `Vehiculo.java`

Representa los vehículos utilizados dentro de RutaMatch.

### `IActualizable.java`

Define el comportamiento relacionado con la actualización de información de las entidades que implementan esta interfaz.

---

## 📂 Paquete `controller`

El paquete `controller` contiene las clases encargadas de gestionar las operaciones de las entidades.

```text
controller/
├── ControllerConductor.java
├── ControllerPasajero.java
└── ControllerVehiculo.java
```

Los Controllers funcionan como intermediarios entre la interfaz gráfica y las clases del modelo.

```text
              ┌───────────────┐
              │     VIEW      │
              │ GUIPrincipal  │
              └───────┬───────┘
                      │
                      ▼
              ┌───────────────┐
              │  CONTROLLER   │
              │               │
              │ Conductor     │
              │ Pasajero      │
              │ Vehiculo      │
              └───────┬───────┘
                      │
                      ▼
              ┌───────────────┐
              │    MODELO     │
              │               │
              │ Persona       │
              │ Conductor     │
              │ Pasajero      │
              │ Vehiculo      │
              └───────────────┘
```

---

## 📂 Paquete `view`

Contiene los elementos relacionados con la interfaz gráfica de la aplicación.

```text
view/
├── GUIPrincipal.java
├── GUIPrincipal.form
└── components/
    ├── ButtonRenderer.java
    └── TableOptionsHelper.java
```

### `GUIPrincipal.java`

Es la interfaz gráfica principal de RutaMatch y permite al usuario interactuar con las funcionalidades del sistema.

### `ButtonRenderer.java`

Componente utilizado para representar botones dentro de elementos de la interfaz gráfica.

### `TableOptionsHelper.java`

Componente auxiliar relacionado con las opciones y operaciones de las tablas de la interfaz.

---

## 📄 `RutaMatch.java`

Es la clase principal de la aplicación y contiene el método `main()` utilizado para iniciar el programa.

---

## 📄 `pom.xml`

Contiene la configuración del proyecto Maven, incluyendo:

* Identificación del proyecto.
* Versión.
* Codificación.
* Versión de Java.
* Configuración de ejecución.
* Dependencias del proyecto.

---

# 🧩 Modelo de clases

La estructura general de las entidades puede representarse de la siguiente manera:

```text
                    Persona
                       │
              ┌────────┴────────┐
              │                 │
          Pasajero          Conductor
                                │
                            Licencia

                    Vehiculo
```

Las clases del modelo representan los datos y comportamientos principales utilizados por los Controllers.

---

# 🛠️ Tecnologías utilizadas

| Tecnología          | Uso                                  |
| ------------------- | ------------------------------------ |
| **Java**            | Lenguaje principal de programación   |
| **Maven**           | Gestión y configuración del proyecto |
| **Java Swing**      | Desarrollo de la interfaz gráfica    |
| **Apache NetBeans** | Entorno de desarrollo                |
| **Git**             | Control de versiones                 |
| **GitHub**          | Repositorio y colaboración           |

---

# ⚙️ Requisitos

Para ejecutar el proyecto se recomienda contar con:

* **Java JDK 24** o una versión compatible con la configuración actual del proyecto.
* **Apache NetBeans**.
* **Apache Maven**.
* **Git**, si se desea trabajar con el repositorio.

---

# 🚀 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/yaritxaduarte-arch/RutaMatch.git
```

### 2. Entrar al proyecto

```bash
cd RutaMatch
```

### 3. Abrir el proyecto

Abrir la carpeta del proyecto desde **Apache NetBeans**.

NetBeans reconocerá el proyecto como un proyecto Maven debido a la presencia del archivo:

```text
pom.xml
```

### 4. Ejecutar

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

# 🔄 Estado del desarrollo

El proyecto se encuentra actualmente **en desarrollo**.

La arquitectura y la lógica de negocio pueden modificarse conforme se incorporen nuevos requerimientos.

Actualmente se trabaja en la implementación y mejora de las operaciones CRUD, los Controllers, las validaciones y la interfaz gráfica.

---

# 📋 Próximos pasos

* [x] Crear estructura inicial del proyecto.
* [x] Implementar entidades principales.
* [x] Crear Controllers.
* [x] Implementar operaciones CRUD.
* [x] Incorporar validaciones y manejo de errores.
* [ ] Mejorar la interfaz gráfica.
* [ ] Ampliar las funcionalidades del sistema.
* [ ] Realizar pruebas completas.
* [ ] Documentar la arquitectura definitiva.
* [ ] Integrar nuevas funcionalidades de acuerdo con los requerimientos del proyecto.

---

# 🔀 Control de versiones

El proyecto utiliza **Git** para el control de versiones y **GitHub** como plataforma para almacenar y compartir el código fuente.

Se recomienda trabajar mediante ramas para desarrollar nuevas funcionalidades sin afectar directamente la rama principal.

Ejemplo:

```bash
git checkout -b nombre-de-la-funcionalidad
```

Después de realizar los cambios:

```bash
git add archivo
git commit -m "Descripción de los cambios"
git push origin nombre-de-la-funcionalidad
```

Se recomienda agregar únicamente los archivos relacionados con el cambio realizado para mantener commits organizados y fáciles de revisar.

---

# 👥 Equipo de desarrollo

**Proyecto:** RutaMatch

**Tecnología principal:** Java

**Gestión del código:** Git / GitHub

---

# 📄 Licencia

Este proyecto fue desarrollado con fines **académicos**.

© 2026 RutaMatch
