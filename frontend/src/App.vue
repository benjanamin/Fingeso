<template>
  <div id="app">
    <div id="nav">
      <router-link to="/SolicitarAtencion">Solicitar Atención</router-link> |
      <router-link to="/RegistroLocal">Registro Local</router-link>
    </div>
    <router-view/>
  </div>
</template>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c2626;
  }

  #nav {
    padding: 30px;
  }

  #nav a {
    font-weight: bold;
    color: #2c2626;
  }

  #nav a.router-link-exact-active {
    color: #b9b742;
  }
</style>
