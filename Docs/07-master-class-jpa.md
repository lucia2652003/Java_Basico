
## ¿Qué necesitarás para esta clase?

✅ JDK o en su defecto openJDK en la **versión 17**

✅ IDE Netbeans, en su **versión 17**

✅ Servidor de base de datos instalado con **MySQL** como SGBD (Sistema Gestor de Base de Datos)

✅ Dependencia .jar de MySQL Connector. **Versión 8.0.33 . Puedes descargarlo haciendo [click aquí](./resources/mysql-connector-j-8.0.33.jar)**

✅ Puedes incluir también la dependencia de MySQL Connector mediante Maven en tu pom.xml mediante el siguiente código de dependencia (en el video explicativo verás como):

```json
<dependency>
   <groupId>com.mysql</groupId>
   <artifactId>mysql-connector-j</artifactId>
   <version>8.0.33</version>
</dependency>
```

✅ Dependencia/librería/biblioteca Javax Persistence en su **versión 7**. Puedes agregarla mediante Maven en tu pom.xml mediante el siguiente código de dependencias (en el video explicativo verás como):

```json
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.core</artifactId>
    <version>2.7.10</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.asm</artifactId>
    <version>9.2.0</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.antlr</artifactId>
    <version>2.7.10</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.jpa</artifactId>
    <version>2.7.10</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.jpa.jpql</artifactId>
    <version>2.7.10</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.moxy</artifactId>
    <version>2.7.10</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>jakarta.persistence</artifactId>
    <version>2.2.3</version>
</dependency>
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.jpa.modelgen.processor</artifactId>
    <version>2.7.10</version>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>javax</groupId>
    <artifactId>javaee-web-api</artifactId>
    <version>7.0</version>
    <type>jar</type>
</dependency>
```

---

## Video paso a paso

A continuación te dejamos una masterclass de cómo llevar a cabo el proceso completo de un CRUD mediante JPA siguiendo un ejercicio práctico como referencia.

El ejercicio Práctico de referencia lo encuentras en los ejercicios de la clase 7 (semana 2) de Java Básico.

¡Veamos como implementar JPA!

[![](./resources/masterclass-jpa-screenshot.png)](https://youtu.be/EjEg91odK4E)

---

## Resolución

A continuación te dejamos el proyecto descargable para que lo tengas como proyecto base o de referencia para llevar a cabo de ahora en más tus proyectos que implementen JPA.

💾 [Descargar resolución final](./resources/masterclassrestaurante.zip)

