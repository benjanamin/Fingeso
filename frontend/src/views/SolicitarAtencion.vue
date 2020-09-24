<template>
  <div class="Solicitar Atencion">
    <img alt="GF logo" src="../assets/Gestor_de_filasLOGO.png">
    <h1>Solicitud de atención para local</h1>
    <h4>Porfavor complete los siguiente campos para solicitar atención.</h4>


    Nombre: <input v-model="Client.name" placeholder="Ingrese nombre">
    <br><br>
    Número: <input v-model="Client.rut" placeholder="Ingrese número">
    <br><br>
    Rut   : <input v-model="Client.phone" placeholder="Ingrese rut">
    <br><br>
    Edad: <input v-model="Client.age" placeholder="Ingrese edad">
    <br><br><br>
    <div id="buttonSolicitarAtencion">
			<button v-on:click="request_atention">Solicitar Atención</button>
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
			Client: {
        name: null,
        rut: null,
        phone: null,
        age: null
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
                ...mapMutations(['RequestNumber']),
          //Se declara el método local create_user, que a su vez utiliza el método de Store llamado createUser, el cual
          //recibe un nuevo usuario (este es obtenido del formulario)
          request_atention(){
            this.RequestNumber(this.Client)
            this.charged = true;
          }
        }
    }

</script>