# 🧠 Actividad Formativa 4 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

**Nombre:** Sandra Mamani
**Carrera:** Analista Programador Computacional
**Sede:** Online / Virtual

---

# 📘 Descripción general

Este proyecto corresponde a la **Actividad Formativa 4** de la asignatura **Desarrollo Orientado a Objetos I**.

El objetivo de esta actividad es implementar una **jerarquía de clases utilizando herencia**, permitiendo modelar distintos servicios turísticos ofrecidos por la agencia **Llanquihue Tour**.

Para ello se diseñó una superclase denominada **ServicioTuristico** y tres clases derivadas que representan distintos tipos de servicios ofrecidos por la agencia.

Durante el desarrollo se aplicaron conceptos fundamentales de Programación Orientada a Objetos, tales como:

* Herencia
* Reutilización de código mediante `super()`
* Sobrescritura del método `toString()`
* Organización del proyecto en paquetes

---

# 🧱 Estructura del proyecto

```text
src/
│
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   └── GestorServicios.java
│
└── ui/
    └── Main.java
```

---

# 🏛️ Clases implementadas

## ServicioTuristico

Es la **superclase** del sistema.

Representa un servicio turístico genérico y contiene los atributos comunes para todos los servicios.

### Atributos

* `String nombre`
* `int duracionHoras`

---

## RutaGastronomica

Hereda de **ServicioTuristico**.

Representa una ruta gastronómica organizada por la agencia.

### Atributo adicional

* `int numeroDeParadas`

---

## PaseoLacustre

Hereda de **ServicioTuristico**.

Representa un paseo lacustre realizado por la agencia.

### Atributo adicional

* `String tipoEmbarcacion`

---

## ExcursionCultural

Hereda de **ServicioTuristico**.

Representa una excursión cultural organizada por la agencia.

### Atributo adicional

* `String lugarHistorico`

---

## GestorServicios

Clase encargada de crear las instancias de prueba de cada uno de los servicios turísticos.

Desde esta clase se generan los objetos utilizados posteriormente por el programa principal.

---

## Main

Clase principal encargada de ejecutar el programa y mostrar por consola la información de los servicios turísticos creados.

---

# 🔍 Conceptos de Programación Orientada a Objetos Aplicados

## Herencia

Las clases:

* RutaGastronomica
* PaseoLacustre
* ExcursionCultural

heredan de la clase **ServicioTuristico**, reutilizando sus atributos y comportamiento común.

---

## Uso de `super()`

Cada subclase utiliza `super(...)` en su constructor para inicializar los atributos heredados de la superclase.

---

## Sobrescritura de métodos

Cada subclase sobrescribe el método `toString()` para mostrar su información específica junto con los datos heredados.

---

# ▶️ Ejecución del programa

Al ejecutar la clase **Main**:

* Se crean dos objetos de cada tipo de servicio turístico mediante la clase **GestorServicios**.
* Posteriormente se muestran por consola utilizando el método `toString()` sobrescrito en cada subclase.

---

# ⚙️ Requisitos

* Java JDK 17 o superior.
* NetBeans o IntelliJ IDEA.

---

# 🚀 Instrucciones para ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/sandramamani-rep/LlanquihueTourAppS6.git
```

2. Abrir el proyecto en NetBeans o IntelliJ IDEA.

3. Ejecutar la clase:

```text
ui/Main.java
```

4. Observar en consola la información de los distintos servicios turísticos creados.

---

# 📌 Ejemplo de salida

```text
=== SISTEMA DE LLANQUIHUE TOUR ===
Nombre: Ruta Patrimonial de Puerto Montt | Duracion horas: 4 hrs | Lugar historico: Fuerte Reina Luisa

Nombre: Paseo Río Maullín | Duracion horas: 2 hrs | Tipo embarcacion: Lancha

Nombre: Sabores de Puerto Varas | Duracion horas: 5 hrs | Numero de paradas: 6

```

---

# 📂 Repositorio GitHub

**Repositorio:**

https://github.com/sandramamani-rep/LlanquihueTourAppS6
---

© Duoc UC | Escuela de Informática y Telecomunicaciones
**Desarrollo Orientado a Objetos I**
