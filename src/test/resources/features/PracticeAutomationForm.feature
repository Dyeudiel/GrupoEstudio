Feature: Automation Practice Form
Yo como Usuario quisiera llenar el formulario de la pagina para completar el registro

Scenario: Formulario completado exitosamente

Given Me encuentro en la pagina toolsqa
When diligencio el fromulario 
| fisrsName|  lastName| sex | experience | date | profession | profilePicture | automationTool | continents | command |
| Fulanito |  Gomez | Male | 3 | 2019/01/01 | Manual Tester | foto.jpg |QTP | Europe | Wait commands |
Then Se visualiza el mensaje de registro exitoso