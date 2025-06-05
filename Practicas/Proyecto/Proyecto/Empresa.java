public class Empresa {
    private String ciudad;
    private String ccp;
    private String sucursal;
    private String telefono;
    
    public Empresa(String ciudad, String ccp, String sucursal, String telefono) {
        this.ciudad = ciudad;
        this.ccp = ccp;
        this.sucursal = sucursal;
        this.telefono = telefono;
    }

    // setters
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setCcp(String ccp) {
        this.ccp = ccp;
    }
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // getters
    public String getCiudad() {
        return ciudad;
    }
    public String getCcp() {
        return ccp;
    }
    public String getSucursal() {
        return sucursal;
    }
    public String getTelefono() {
        return telefono;
    }
}