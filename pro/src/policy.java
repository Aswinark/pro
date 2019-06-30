
public class policy {
	String Policy;
	int Cost;
	String doe;
	String doa;
	String dod;
	String hdiv;
	public policy(String policy, int cost, String doe, String doa, String dod, String hdiv) {
		super();
		Policy = policy;
		Cost = cost;
		this.doe = doe;
		this.doa = doa;
		this.dod = dod;
		this.hdiv = hdiv;
	}
	public String getPolicy() {
		return Policy;
	}
	public void setPolicy(String policy) {
		Policy = policy;
	}
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public String getDoa() {
		return doa;
	}
	public void setDoa(String doa) {
		this.doa = doa;
	}
	public String getDod() {
		return dod;
	}
	public void setDod(String dod) {
		this.dod = dod;
	}
	public String getHdiv() {
		return hdiv;
	}
	public void setHdiv(String hdiv) {
		this.hdiv = hdiv;
	}
	
}
