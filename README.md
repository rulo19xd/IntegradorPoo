# IntegradorPoo
Trabajo integrador de POO basado en la refactorización y adaptación de un proyecto existente.
# Manual Técnico y de Usuario
## Sistema de Gestión de Transporte y Envíos (POO Uber)

**Trabajo Práctico Integrador de Programación Orientada a Objetos**  
**Curso:** 2do Año  
**Fecha de Entrega:** 17 de Junio de 2026  

---

### 1. Datos del Proyecto

* **Autores:**
  * [Tu Nombre y Apellido]
  * [Nombre y Apellido Alumno 2]
  * [Nombre y Apellido Alumno 3]
  * [Nombre y Apellido Alumno 4]
  * [Nombre y Apellido Alumno 5]
  * [Nombre y Apellido Alumno 6]
* **Nombre de la Aplicación:** *Sistema de Gestión de Transporte POO*
* **Versión:** 1.0
* **Tecnologías Empleadas:**
  * Apache NetBeans IDE (Entorno de Desarrollo)
  * Lenguaje Java (JDK 8 o superior)
  * Java Swing / AWT (Para el desarrollo de la interfaz gráfica)
  * GitHub (Para el control de versiones y trabajo colaborativo)
* **Repositorio Base Utilizado:** [Curso_POO/POOUber](https://github.com/bl00p1ng/Curso_POO/tree/main/POOUber/Java)
* **Repositorio del Equipo:** [Pegá acá el link de tu GitHub]

---

### 2. Descripción General del Sistema
La función principal de este programa es simular una plataforma de transporte de pasajeros y logística de envíos de encomiendas a nivel urbano (estilo Uber). A diferencia del repositorio base que funcionaba únicamente por consola de comandos, esta versión traslada toda la experiencia a un entorno gráfico (GUI) intuitivo, donde el usuario interactúa mediante ventanas, botones y validaciones en tiempo real para gestionar altas, cotizaciones y asignaciones automáticas de viajes.

---

### 3. Detalle Técnico de las Modificaciones (Enfoque ABM)
Partiendo del código base, el equipo reestructuró el proyecto para implementar las operaciones esenciales de un ABM (Alta, Baja, Modificación) aplicadas a objetos en memoria:

#### 📂 Diseño e Integración de la Interfaz Gráfica (GUI)
* Creamos el paquete `com.mycompany.poo.ui` para aplicar la separación de capas (Vista y Lógica).
* Diseñamos `OriginFrame.java` (`JFrame`) como la ventana principal del sistema.
* Desarrollamos tres subpaneles contenedores: `UsuarioPanel.java`, `ViajePanel.java` y `EnvioPanel.java` (`JPanel`) para modularizar cada sección.

#### ⚙️ Lógica del ABM (Alta, Baja, Modificación y Consulta)
* **ALTA (Creación):** Mediante los formularios de la interfaz, el programa permite instanciar dinámicamente en memoria objetos de las clases `User` (Pasajeros), `Viaje` y `Envio`.
* **MODIFICACIÓN (Edición):** Se programaron botones que invocan los métodos *setter* encapsulados para alterar las propiedades de los servicios en tiempo de ejecución (por ejemplo, cambiar el tipo de tarifa, recalcular distancias o modificar las dimensiones del paquete).
* **CONSULTA (Lectura):** El sistema realiza búsquedas lógicas internas para asignar un conductor disponible (`Driver`) que cumpla con el tipo de vehículo seleccionado, mostrando sus datos finales en pantalla.

#### 📦 Modularización en Paquetes
El código se reorganizó en paquetes limpios para garantizar el orden del proyecto:
* `accounts`: Gestión de usuarios y cuentas.
* `app`: Lógica central e inicio del sistema.
* `enums`: Tipos de vehículos y tamaños de paquetes.
* `services` / `uber`: Estructura lógica del negocio de transporte.
* `ui`: Capa de componentes gráficos.
* `vehicles`: Entidades físicas de transporte.

Se aplicaron pilares fundamentales de POO como el **Encapsulamiento** (atributos privados) y la **Herencia** (las clases derivadas de vehículos y tipos de Uber).

---

### 4. Funcionamiento y Guía de Uso de la Aplicación
Al ejecutar el programa mediante la clase principal `Main.java`, el usuario se encontrará con una ventana que contiene tres secciones bien definidas:

#### 👤 4.1. Panel de Usuarios
* **Propósito:** Permite el registro en memoria de los clientes de la aplicación.
* **Campos requeridos:** Nombre, Email, DNI y Teléfono.
* **Reglas y validaciones de interfaz:**
  * *Validación de Email:* El campo obliga a colocar el carácter `"@"` para que el objeto se cree. Si no se coloca, el programa frena el alta.
  * *Restricción Numérica:* Los campos de DNI y Teléfono están programados para admitir únicamente números.

#### 📦 4.2. Panel de Envíos
* **Propósito:** Gestionar y simular el despacho de encomiendas a domicilio.
* **Flujo de uso:** El usuario selecciona qué cliente realiza el envío (de los dados de alta anteriormente), ingresa la distancia en kilómetros y elige el tamaño del paquete entre **Pequeño**, **Mediano** o **Grande**.
* **Lógica de asignación:** Al cotizar y confirmar, el sistema calcula el precio (a mayor tamaño, mayor tarifa) y asigna automáticamente el vehículo según una regla de negocio programada: paquetes pequeños/medianos van en **Moto** (`Bike`), y paquetes grandes van en **Auto** (`Car`).

#### 🚗 4.3. Panel de Viajes
* **Propósito:** Solicitar el transporte privado para un pasajero.
* **Flujo de uso:** Se selecciona el usuario, se introduce la distancia del trayecto y se define la categoría del servicio mediante los botones de opción:
  * `UberMoto`: La opción más veloz y económica.
  * `UberX`: Servicio estándar en automóvil.
  * `UberComfort`: Opción premium en autos seleccionados de mayor gama.
* **Resultado:** Tras presionar "Cotizar" y luego "Confirmar", la aplicación simula la asignación y despliega en un cuadro los datos del chofer asignado, el vehículo que conduce, su número de patente y el tiempo estimado de arribo.

---

### 🚀 5. Futuras Funcionalidades (Próximas Versiones)
Como propuesta de escalabilidad para el sistema, se planifican los siguientes módulos:
1. **Persistencia de datos real:** Reemplazar el almacenamiento temporal en memoria (listas/arreglos) por una base de datos relacional incrustada (como SQLite), permitiendo que los usuarios registrados no se borren al cerrar la aplicación.
2. **Panel de Administración Independiente (Alta de Choferes):** Integrar un login exclusivo para administradores, de manera que se puedan registrar, modificar y dar de baja nuevos conductores (`Driver`) directamente desde la interfaz, eliminando la precarga interna de la simulación.
3. **Integración con API de Mapas:** Añadir un componente visual interactivo para simular el trayecto en un mapa digital en lugar de ingresar la distancia manualmente por teclado.
