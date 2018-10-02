 -- String mensaje = ""; es el mensaje o el nombre de la persona que viene de la base de datos
 -- int caracteres = 0; es para controlar el numero de caracteres por línea en el display
 -- Serial.begin(9600) es el numero de potencia para el led
 -- lcd.begin(16,2); es para iniciar el led
 -- lcd.setCursor(0,0) es para situar el cursor en la columna 0 fila 0
 -- delay (3000); el mensaje va a durar 3 segundos y entonces se va a apagar
 
 -- char(Serial.read()); convierte el asci de la letra a char
 
 -- caracteres = mensaje.length();
    if (caracteres>16){
      lc.clear();
      lcd.print(Mensaje.substring(0,16)); -- se imprimen los primeros 16 caracteres
      lcd.setCursor(0,1); -- se situa el cursor a la posicion 0 del renglon 2
      lcd.print(Mensaje.substring(16, caracteres)); -- se impremen los ultimos caracteres restantes
    }
    
    https://github.com/RubenRedondo/myspa.git


PARA LED VERDE Y ROJO

- poner una resistencia que va al negativo
- buscar la pata negativa del led y ponerla ahí
- hacer lo mismo con el otro led
- cable del pin 8 al positivo del primer led
- cable del pin 7 al positivo del segundo led
