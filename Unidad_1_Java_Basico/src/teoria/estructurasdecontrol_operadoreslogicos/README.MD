# 📘 Java Cheatsheet – Estructuras de Control y Operadores Lógicos

Clase: `Clase1_EstructurasDeControl_OperadoresLogicos`

---

## 🧠 CONDICIONALES (IF)

### 📌 ¿Qué hacen?
Permiten tomar decisiones en el programa.

```java
if (condicion) {
    // código que se ejecuta si es TRUE
}
```

### 🔍 Ejemplo

```java
boolean x = 1 > 2; // false
boolean y = 1 < 2; // true
```

✔ Las condiciones SIEMPRE regresan:
- `true`
- `false`

---

## 🔢 OPERADORES LÓGICOS

### 📌 Sirven para comparar valores

| Operador | Significado          | Ejemplo        | Resultado |
|----------|---------------------|---------------|-----------|
| `>`      | Mayor que           | `a > b`       | true/false |
| `<`      | Menor que           | `a < b`       | true/false |
| `>=`     | Mayor o igual       | `a >= b`      | true/false |
| `<=`     | Menor o igual       | `a <= b`      | true/false |
| `==`     | Igual               | `a == b`      | true/false |
| `!=`     | Diferente           | `a != b`      | true/false |

### 🔍 Ejemplo

```java
int a = 0;
int b = 10;

boolean r0 = a > b;   // false
boolean r1 = a < b;   // true
boolean r2 = b > a;   // true
boolean r3 = a == b;  // false
boolean r4 = a != b;  // true
```

---

## ⚡ USO DE IF

```java
if (a >= b) {
    System.out.println("Se cumple a >= b");
}

if (a == b) {
    System.out.println("Se cumple a == b");
}
```

⚠️ **IMPORTANTE**
- `if` separados → pueden ejecutarse varios bloques

---

## 🔀 IF - ELSE

### 📌 Ejecuta una cosa u otra (nunca ambas)

```java
if (a > b) {
    System.out.println("Se cumple a > b");
} else {
    System.out.println("No se cumple a > b");
}
```

---

## 🔁 IF - ELSE IF (CADENA)

### 📌 Solo se ejecuta UNA condición

```java
if (a > b) {
    System.out.println("a > b");
} else if (a < b) {
    System.out.println("a < b");
} else if (a == b) {
    System.out.println("a == b");
} else {
    System.out.println("Ninguna condición se cumplió");
}
```

### 🧠 Reglas
- Se evalúa de arriba hacia abajo
- Se detiene en la primera verdadera

---

## ⚠️ NOTA IMPORTANTE

```java
// Para primitivos (int, boolean, etc.)
a == b
a != b

// Para objetos (String, etc.)
texto1.equals(texto2)
```

---

## 🚀 RESUMEN RÁPIDO

| Tema        | Clave |
|-------------|------|
| `if`        | Ejecuta si es TRUE |
| `else`      | Alternativa si es FALSE |
| `else if`   | Solo una condición se ejecuta |
| Operadores  | Comparan valores |
| Resultado   | Siempre TRUE o FALSE |

---

💻 **Nivel:** Principiante  
📚 **Tema:** Lógica y control de flujo en Java