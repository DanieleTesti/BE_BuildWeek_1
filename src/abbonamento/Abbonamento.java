package abbonamento;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Abbonamento.findAll", query = "SELECT a FROM Abbonamento a")
public class Abbonamento {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		@Enumerated(EnumType.STRING)
		private Tipologia_abbonamento tipologia_abbonamento;
//		@ManyToOne
		private Integer tessera;
		// @ManyToOne
		private Integer rivenditore;

		private LocalDate data_inizio_abbonamento;
		private LocalDate data_fine_abbonamento;

		public LocalDate getData_inizio_abbonamento() {
			return data_inizio_abbonamento;
		}

		public void setData_inizio_abbonamento(LocalDate data_inizio_abbonamento) {
			this.data_inizio_abbonamento = data_inizio_abbonamento;
		}

		public LocalDate getData_fine_abbonamento() {
			return data_fine_abbonamento;
		}

		public void setData_fine_abbonamento(LocalDate data_fine_abbonamento) {
			this.data_fine_abbonamento = data_fine_abbonamento;
		}

		public Abbonamento() {
			super();
		}

//		public Abbonamento(Tipologia_abbonamento tipologia_abbonamento, Tessera tessera,
//				Rivenditore_autorizzato rivenditore, LocalDate data_inizio_abbonamento) {
//			super();
//			this.tipologia_abbonamento = tipologia_abbonamento;
//			this.tessera = tessera;
//			this.rivenditore = rivenditore;
//			this.data_inizio_abbonamento = data_inizio_abbonamento;
//
//			if (tipologia_abbonamento == Tipologia_abbonamento.Settimanale) {
//				data_fine_abbonamento = data_inizio_abbonamento.plusDays(7);
//			} else if (tipologia_abbonamento == Tipologia_abbonamento.Mensile) {
//				data_fine_abbonamento = data_inizio_abbonamento.plusMonths(1);
//			}
//		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Tipologia_abbonamento getTipologia_abbonamento() {
			return tipologia_abbonamento;
		}

		public void setTipologia_abbonamento(Tipologia_abbonamento tipologia_abbonamento) {
			this.tipologia_abbonamento = tipologia_abbonamento;
		}

		public Integer getTessera() {
			return tessera;
		}

		public void setTessera(Integer tessera) {
			this.tessera = tessera;
		}

		public Integer getRivenditore() {
			return rivenditore;
		}

		public void setRivenditore(Integer rivenditore) {
			this.rivenditore = rivenditore;
		}

		@Override
		public String toString() {
			return "Abbonamento [id=" + id + ", tipologia_abbonamento=" + tipologia_abbonamento + ", tessera=" + tessera
					+ ", rivenditore=" + rivenditore + ", data_inizio_abbonamento=" + data_inizio_abbonamento
					+ ", data_fine_abbonamento=" + data_fine_abbonamento + "]";
		}

}
