package strategy01;

public enum TypeFreight {

	NORMAL {
		@Override
		public Freight instance() {
			return new NormalFreight();
		}
	},
	FAST {
		@Override
		public Freight instance() {
			return new FastFreight();
		}
	};
	
	public abstract Freight instance();
	
}
