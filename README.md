# javax-servlet-compat

Compatibility layer providing `javax.servlet` API interfaces for **Jakarta EE 9+** (Tomcat 10+) runtime.

## Why

Jakarta EE 9 introduced the `jakarta.*` namespace, replacing the legacy `javax.*` packages. Many third-party libraries and legacy projects still depend on `javax.servlet` APIs. This module provides a thin compatibility shim that re-exports the `javax.servlet` interfaces by delegating to the corresponding `jakarta.servlet` APIs, allowing legacy code to run on Tomcat 10+ without modification.

## Requirements

- **Java 17+**
- **Jakarta Servlet API 6.0+** (provided scope)
- **Jakarta JSP API 3.1+** (provided scope)
- **Jakarta EL API 5.0+** (provided scope)

## Usage

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>javax-servlet-compat</artifactId>
    <version>2.0.0-SNAPSHOT</version>
</dependency>
```

Make sure the Jakarta EE dependencies are available at runtime (e.g., via Tomcat 10+).

## Packages Covered

| Package | Description |
|---|---|
| `javax.servlet` | Core Servlet API (Servlet, Filter, Request, Response, etc.) |
| `javax.servlet.annotation` | Servlet annotations (`@WebServlet`, `@WebFilter`, etc.) |
| `javax.servlet.descriptor` | JSP configuration descriptors |
| `javax.servlet.http` | HTTP-specific Servlet API (HttpServlet, HttpServletRequest, etc.) |
| `javax.servlet.jsp` | JSP API (JspWriter, PageContext, etc.) |
| `javax.servlet.jsp.el` | Expression Language integration |
| `javax.servlet.jsp.jstl.core` | JSTL core configuration |
| `javax.servlet.jsp.tagext` | Custom tag extension API |

## Build

```bash
mvn clean package
```

## License

This project is provided as-is for compatibility purposes.
