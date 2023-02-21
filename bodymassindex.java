public class bodymassindex
{
    public static void main(String[] args) {
        
        int Alter = 33;
        
        // If you need to specify gender in the task, remove the "//" character
        // Wenn Sie das Geschlecht in der Aufgabe angeben müssen, entfernen Sie das Zeichen "//"
            //char Geschlecht = 'W';
        
        //Beischpiel mit double
        
            double Gewicht1 = 120d, Größe1 = 1.86d;
            double bmi = Gewicht1/(Größe1 * Größe1); 
        
        // Beispiel mit float
            float Gewicht2 = 120f, Größe2 = 1.86f;
            float bmi2 = Gewicht2/(Größe2 * Größe2);
        
            System.out.println("Body Mass Index (BMI) (double) ist : " + bmi + " kg/m2");
            System.out.println("Body Mass Index (BMI) (float) ist : " + bmi2 + " kg/m2");
            
             if (Alter < 24 ){
                    if ( bmi < 19 ) {
                        System.out.println("Ihr Ergebnis: Untergewicht"); 
                    }
                    else if ( bmi < 24 ) {
                       System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                    }
                    else if ( bmi < 30) {
                        System.out.println("Ihr Ergebnis: Übergewicht");  
                    } else if ( bmi < 40) {
                        System.out.println("Ihr Ergebnis: Adipositas");  
                    }
                    else if ( bmi > 40){
                      System.out.println("Ihr Ergebnis: massive Adipositas");  
                    }
                }
                else if (Alter < 34 ){
                    if ( bmi < 20 ) {
                        System.out.println("Ihr Ergebnis: Untergewicht"); 
                    }
                    else if ( bmi < 25 ) {
                       System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                    }
                    else if ( bmi < 30) {
                        System.out.println("Ihr Ergebnis: Übergewicht");  
                    } else if ( bmi < 40) {
                        System.out.println("Ihr Ergebnis: Adipositas");  
                    }
                    else if ( bmi > 40){
                      System.out.println("Ihr Ergebnis: massive Adipositas");  
                    }
                }
                else if (Alter < 44 ){
                    if ( bmi < 21 ) {
                        System.out.println("Ihr Ergebnis: Untergewicht"); 
                    }
                    else if ( bmi < 26 ) {
                       System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                    }
                    else if ( bmi < 30) {
                        System.out.println("Ihr Ergebnis: Übergewicht");  
                    } else if ( bmi < 40) {
                        System.out.println("Ihr Ergebnis: Adipositas");  
                    }
                    else if ( bmi > 40){
                      System.out.println("Ihr Ergebnis: massive Adipositas");  
                    }
                }
                else if (Alter < 54 ){
                    if ( bmi < 22 ) {
                        System.out.println("Ihr Ergebnis: Untergewicht"); 
                    }
                    else if ( bmi < 27 ) {
                       System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                    }
                    else if ( bmi < 30) {
                        System.out.println("Ihr Ergebnis: Übergewicht");  
                    } else if ( bmi < 40) {
                        System.out.println("Ihr Ergebnis: Adipositas");  
                    }
                    else if ( bmi > 40){
                      System.out.println("Ihr Ergebnis: massive Adipositas");  
                    }
                }
                else if (Alter < 64 ){
                    if ( bmi < 23 ) {
                        System.out.println("Ihr Ergebnis: Untergewicht"); 
                    }
                    else if ( bmi < 28 ) {
                       System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                    }
                    else if ( bmi < 30) {
                        System.out.println("Ihr Ergebnis: Übergewicht");  
                    } else if ( bmi < 40) {
                        System.out.println("Ihr Ergebnis: Adipositas");  
                    }
                    else if ( bmi > 40){
                      System.out.println("Ihr Ergebnis: massive Adipositas");  
                    }
                }
                else if (Alter > 64 ){
                    if ( bmi < 24 ) {
                        System.out.println("Ihr Ergebnis: Untergewicht"); 
                    }
                    else if ( bmi < 29 ) {
                       System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                    }
                    else if ( bmi < 30) {
                        System.out.println("Ihr Ergebnis: Übergewicht");  
                    } else if ( bmi < 40) {
                        System.out.println("Ihr Ergebnis: Adipositas");  
                    }
                    else if ( bmi > 40){
                      System.out.println("Ihr Ergebnis: massive Adipositas");  
                    }
                }
            
        
        // If you need to specify gender in the task, remove the "/**/" character
        // Wenn Sie das Geschlecht in der Aufgabe angeben müssen, entfernen Sie das Zeichen "/**/"
            /*if (Geschlecht == 'm' || Geschlecht == 'M' ){
            if (Alter < 24 ){
                if ( bmi < 19 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 24 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 34 ){
                if ( bmi < 20 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 25 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 44 ){
                if ( bmi < 21 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 26 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 54 ){
                if ( bmi < 22 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 27 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 64 ){
                if ( bmi < 23 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 28 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter > 64 ){
                if ( bmi < 24 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 29 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
        }
        
            if (Geschlecht == 'w' || Geschlecht == 'W' ){
            if (Alter < 24 ){
                if ( bmi < 19 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 24 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 34 ){
                if ( bmi < 20 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 25 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 44 ){
                if ( bmi < 21 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 26 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 54 ){
                if ( bmi < 22 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 27 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter < 64 ){
                if ( bmi < 23 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 28 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
            else if (Alter > 64 ){
                if ( bmi < 24 ) {
                    System.out.println("Ihr Ergebnis: Untergewicht"); 
                }
                else if ( bmi < 29 ) {
                   System.out.println("Ihr Ergebnis: wünschenswerte Normalgewicht");  
                }
                else if ( bmi < 30) {
                    System.out.println("Ihr Ergebnis: Übergewicht");  
                } else if ( bmi < 40) {
                    System.out.println("Ihr Ergebnis: Adipositas");  
                }
                else if ( bmi > 40){
                  System.out.println("Ihr Ergebnis: massive Adipositas");  
                }
            }
        }*/
    }
}

