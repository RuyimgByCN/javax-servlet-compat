# javax-servlet-compat

[English](#english) | [中文](#中文)

---

## English

Compatibility layer providing `javax.servlet` API interfaces for **Jakarta EE 9+** (Tomcat 10+) runtime.

### Why

Jakarta EE 9 introduced the `jakarta.*` namespace, replacing the legacy `javax.*` packages. Many third-party libraries and legacy projects still depend on `javax.servlet` APIs. This module provides a thin compatibility shim that re-exports the `javax.servlet` interfaces by delegating to the corresponding `jakarta.servlet` APIs, allowing legacy code to run on Tomcat 10+ without modification.

### Requirements

- **Java 17+**
- **Jakarta Servlet API 6.0+** (provided scope)
- **Jakarta JSP API 3.1+** (provided scope)
- **Jakarta EL API 5.0+** (provided scope)

### Usage

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>javax-servlet-compat</artifactId>
    <version>2.0.0-SNAPSHOT</version>
</dependency>
```

Make sure the Jakarta EE dependencies are available at runtime (e.g., via Tomcat 10+).

### Packages Covered

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

### Build

```bash
mvn clean package
```

---

## 中文

为 **Jakarta EE 9+**（Tomcat 10+）运行时提供 `javax.servlet` API 接口的兼容层。

### 背景

Jakarta EE 9 引入了 `jakarta.*` 命名空间，取代了原有的 `javax.*` 包。但许多第三方库和遗留项目仍依赖 `javax.servlet` API。本模块提供了一个轻量级的兼容垫片，通过委托给对应的 `jakarta.servlet` API 来重新导出 `javax.servlet` 接口，使遗留代码无需修改即可在 Tomcat 10+ 上运行。

### 环境要求

- **Java 17+**
- **Jakarta Servlet API 6.0+**（provided 作用域）
- **Jakarta JSP API 3.1+**（provided 作用域）
- **Jakarta EL API 5.0+**（provided 作用域）

### 使用方式

在 `pom.xml` 中添加依赖：

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>javax-servlet-compat</artifactId>
    <version>2.0.0-SNAPSHOT</version>
</dependency>
```

请确保 Jakarta EE 依赖在运行时可用（例如通过 Tomcat 10+）。

### 覆盖的包

| 包名 | 说明 |
|---|---|
| `javax.servlet` | 核心 Servlet API（Servlet、Filter、Request、Response 等） |
| `javax.servlet.annotation` | Servlet 注解（`@WebServlet`、`@WebFilter` 等） |
| `javax.servlet.descriptor` | JSP 配置描述符 |
| `javax.servlet.http` | HTTP 相关 Servlet API（HttpServlet、HttpServletRequest 等） |
| `javax.servlet.jsp` | JSP API（JspWriter、PageContext 等） |
| `javax.servlet.jsp.el` | 表达式语言集成 |
| `javax.servlet.jsp.jstl.core` | JSTL 核心配置 |
| `javax.servlet.jsp.tagext` | 自定义标签扩展 API |

### 构建

```bash
mvn clean package
```

## License

This project is provided as-is for compatibility purposes.
