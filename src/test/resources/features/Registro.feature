Feature: Automation Practice Form
  Yo como Usuario quisiera registrarme enla pagina

  @Registro
  Scenario: Registro exitoso
    Given Me encuentro en la pagina automationpractice
    When digilencio en formulario
      | correo                  | sexo      | nombre | apellido  | contrasena | fechaNacimient | direccion | ciudad | estado | zip   | celular   | otraDireccion |
      | haciendoprueba@test.com | masculino | daniel | rodriguez |  343574656 | 23/5/1997      | calle 103 | bogota | Utah   | 00000 | 314645099 | cra75         |
    Then Se visualiza el registro exitoso
