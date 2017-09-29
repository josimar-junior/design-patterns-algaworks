package model;

import seguro.CalculadoraPremioSeguro;
import seguro.CalculadoraPremioSeguroParaCarro;
import seguro.CalculadoraPremioSeguroParaMoto;

public enum TipoVeiculo {

	CARRO {
		@Override
		public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
			return new CalculadoraPremioSeguroParaCarro();
		}
	},
	MOTO {
		@Override
		public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
			return new CalculadoraPremioSeguroParaMoto();
		}
	};

	public abstract CalculadoraPremioSeguro getCalculadoraPremioSeguro();
}
