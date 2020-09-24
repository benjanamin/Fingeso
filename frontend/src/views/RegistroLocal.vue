<template>
  <div class="Registro Local">
    <img alt="GF logo" src="../assets/Gestor_de_filasLOGO.png">
    <h1>Registro de local</h1>
    <h4>Porfavor complete el formulario de registro de local.</h4>

    Nombre del local : <input v-model="Local.name" placeholder="Ingrese el nombre del local">
    <br><br>
    Dirección del local : <input v-model="Local.adress" placeholder="Ingrese dirección del local">
    <br><br>
    <div id="buttonSolicitarRegistro">
			<button v-on:click="create_local">Solicitar Registro</button>
		</div>
  </div>
</template>

<script>	
	//Importación de mapState y mapMutations de vuex para utilizar Store con sus variables globales.
    import {mapMutations} from 'vuex';

    export default {
		//Acá se declaran los datos que serán utilizados de manera local en esta vista.
        data: () => ({
			charged: false,
			Local: {
        name: null,
        adress: null
			},
        }),

		//Vue tiene un ciclo de carga y en computed normalmente se cargan constantemente las variables globales que se encuentran
		//en store
        computed: {
			//Se trae la variable global Users desde la store. En un principio está vacía.
            //...mapState(['users'])},
        },
        methods: {
          //Se traen los métodos que modifican las variables globales en la store. 
                ...mapMutations(['CreateLocal']),
          //Se declara el método local create_user, que a su vez utiliza el método de Store llamado createUser, el cual
          //recibe un nuevo usuario (este es obtenido del formulario)
          create_local(){
            this.CreateLocal(this.Local)
            this.charged = true;
          }
        }
    }

</script>