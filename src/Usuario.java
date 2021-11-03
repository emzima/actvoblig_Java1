public class Usuario {
    /* Declaración de las variables */
    String nombres;
    String apellidos;
    int edad;
    String hobbie;
    String editorPreference;
    String systemOperativoUse;
    /* Dos métodos constructores */
    Usuario() {
        nombres= null ;
        apellidos= null;
        edad= 0;
        hobbie= null;
        editorPreference= null;
        systemOperativoUse= null;
    }
    Usuario(String nombres, String apellidos, int edad, String hobbie, String editorPreference, String systemOperativoUse) {
        this.nombres= nombres;
        this.apellidos= apellidos;
        this.edad= edad;
        this.hobbie= hobbie;
        this.editorPreference= editorPreference;
        this.systemOperativoUse= systemOperativoUse;
    }
    /* Métodos setters y getters */
    void setNombres(String nm) {
        nombres = nm;
    }
    String getNombre() {
        return nombres;
    }
    void setApellidos(String ap) {
        apellidos = ap;
    }
    String getApellido() {
        return apellidos;
    }
    void setEdad(int ed) {
        edad = ed;
    }
    int getEdad() {
        return edad;
    }
    void setHobbie(String hb) {
        hobbie = hb;
    }
    String getHobbie() {
        return hobbie;
    }
    void setEditorPreference(String ep) {
        editorPreference = ep;
    }
    String getEditorPreference () {
        return editorPreference;
    }
    void setSystemOperativoUse(String sou) {
        systemOperativoUse = sou;
    }
    String getSystemOperativoUse() {
        return systemOperativoUse;
    }
    /* Impresión con la sobreescritura del método toString */
    @Override
    public String toString() {
        return  "\n\nNombres y Apellidos:       " +nombres+ " " +apellidos+
                "\nEdad y hobbie:             " +edad+" años y el hobbie es "+hobbie+
                "\nEditor preferido:          " +editorPreference+
                "\nSistema Operativo usado:   " +systemOperativoUse;
    }
}
