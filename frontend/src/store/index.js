import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios';

Vue.use(Vuex, axios)

export default new Vuex.Store({
  state: {
    Locales:[],
    Client:null
  },
  // Funcionando, Revisar error al agregar mas de un local (solo si queda tiempo :)
  mutations: {
    CreateLocal(state,Local){
      try {
		axios.post('http://localhost:8081/local/create/', Local)
			.then(response => {
			// eslint-disable-next-line no-console
			console.log(response);
		})
		.catch(function (error) {
			// eslint-disable-next-line no-console
			console.log(error);
		});		
		} catch (err) {
			console.log("Se obtuvo el siguiente error al crear el usuario: " + err)
		}
    },
    RequestNumber(state,Client){
      try {
		axios.post('http://localhost:8081/local/addClient/0/', Client)
			.then(response => {
				// eslint-disable-next-line no-console
				console.log(response);
			})
			.catch(function (error) {
				// eslint-disable-next-line no-console
				console.log(error);
			});
		} catch (err) {
			console.log("Se obtuvo el siguiente error al solicitar el número: " + err)
		}
    }
  },
  actions: {
  },
  modules: {
  }
})
