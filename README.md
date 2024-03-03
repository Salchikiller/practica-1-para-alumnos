# Guía Paso a Paso - Estimación de Pi con Método de Montecarlo

Este repositorio contiene un programa Java que utiliza el método de Montecarlo para estimar el valor de Pi.

## Pasos para Ejecutar

### 1. Clonar el Repositorio

Abre la terminal en tu computadora:

- En Windows: Busca "Command Prompt" (Símbolo del Sistema) en el menú de inicio y haz clic para abrirlo.
- En macOS: Busca "Terminal" en la carpeta "Utilities" (Utilidades) dentro de la carpeta "Applications" (Aplicaciones) y haz doble clic para abrirlo.
- En Linux: Puedes abrir la terminal usando el atajo de teclado Ctrl + Alt + T.

Luego, clona el repositorio usando el siguiente comando:

```bash
git clone 'https://github.com/Salchikiller/-Practica_1.git'
```



### 2. Navegar al Directorio del Repositorio

Una vez clonado el repositorio, navega al directorio donde se encuentra:

```bash
cd practica-1-para-alumnos
```

### 3. Limpiar Archivos Previamente Compilados

Para asegurarnos de que estamos trabajando con un estado limpio, vamos a eliminar cualquier archivo previamente compilado:

```bash
make limpiar
```

### 4. Compilar el Código Fuente

Ahora vamos a compilar el código fuente del programa:

```bash
make compilar
```

### 5. Crear el Archivo JAR

Después de compilar, vamos a crear el archivo JAR que contiene el programa:

```bash
make jar
```

### 6. Ejecutar el Programa

Finalmente, vamos a ejecutar el programa para obtener una estimación de Pi. Reemplaza `x` con el número de puntos que deseas generar para la estimación de Pi:

```bash
java -jar src/pi.jar x
```

Por ejemplo, para generar 1000 puntos y estimar Pi, ejecuta:

```bash
java -jar src/pi.jar 5000
```

