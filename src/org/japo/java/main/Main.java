/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final double DIN_PRS = 2.0; // Dinero por persona
        final double FILM_PRC = 1.30; // precio película
        final double PLMTS_PRC = 0.9; // Precio palomitas
        final int PRSS = 2; // Personas que van (dos "S" para indicar plural)

        //Variables
        double plmtsPorPer = PLMTS_PRC / PRSS; // Palomitas por persona
        double gastPorPer = plmtsPorPer + FILM_PRC; // Gastos por persona
        double restos = DIN_PRS - gastPorPer; // Dinero que sobra por persona

        //Salida
        //  Cabecera
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");

        //  Dinero por persona
        System.out.printf(Locale.ENGLISH,
                "Dinero inicial .....: %.2f €%n",
                DIN_PRS);

        //  Separador_1
        System.out.println("---");

        //  Precios
        System.out.printf(Locale.ENGLISH,
                "Precio película ....: %.2f €%n",
                FILM_PRC);
        System.out.printf(Locale.ENGLISH,
                "Parte palomitas ....: %.2f €%n",
                plmtsPorPer);

        //  Separador_2
        System.out.println("---");

        //  Dinero que gasta cada uno
        System.out.printf(Locale.ENGLISH,
                "Gastos por persona .: %.2f €%n",
                gastPorPer);

        //  Separador_3
        System.out.println("---");

        //  Dinero restante de cada uno
        System.out.printf(Locale.ENGLISH,
                "Dinero restante ....: %.2f €%n",
                restos);
    }
}
