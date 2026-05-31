package com.example.umbb_mobguide;

import java.util.ArrayList;

public class Dataprovider {

    public static ArrayList<Faculty> getFaculties() {
        ArrayList<Faculty> faculties = new ArrayList<>();

        // 1. Faculty of Sciences
        Faculty f1 = new Faculty(
                "Faculty of Sciences (FS)",
                "The hub for fundamental and applied sciences at UMBB, offering specialized programs in technology, nature, and life sciences to prepare the next generation of researchers and innovators",
                "fs@univ-boumerdes.dz",
                "+213 24 79 90 05",
                "Faculty of Sciences, Campus Sud, Boumerdes",
                36.7628, 3.4760
        );
        f1.addDepartment(new Department("Computer Science", "learn to code, build software, and manage data systems to solve modern digital problems.", "informatique@univ-boumerdes.dz", "+213 24 81 60 12", "Campus Sud, Faculty of Sciences", "L3-SI, Master GL, Master IA", "💻", "#6A1B9A"));
        f1.addDepartment(new Department("Mathematics", "Department covering pure and applied mathematics.", "maths@univ-boumerdes.dz", "+213 24 81 60 13", "Campus Sud, Faculty of Sciences", "L3:Math pur,Math applique ,Data science,Master Algebra", "📐", "#6A1B9A"));
        f1.addDepartment(new Department("Biology", "Department covering life sciences and biotechnology.", "bio@univ-boumerdes.dz", "+213 24 81 60 14", "Campus Sud, Faculty of Sciences", "L3-Biology, Master Biotechnology", "🧬", "#2E7D32"));
        f1.addDepartment(new Department("Physics", "Department covering fundamental and applied physics.", "physics@univ-boumerdes.dz", "+213 24 81 60 15", "Campus Sud, Faculty of Sciences", "L3-Physics, Master recherche operationnel,ciber security,Finance", "⚛️", "#00838F"));
        f1.addDepartment(new Department("Agronomy", "Covers agricultural sciences, plant biology and soil sciences.", "agronomie@univ-boumerdes.dz", "+213 24 81 60 17", "Campus Sud, Faculty of Sciences", "L3-Agronomie, Master Sciences Agronomiques", "🌾", "#558B2F"));
        f1.addDepartment(new Department("Sports Sciences (STAPS)", "Covers physical activities, sports sciences and physical education.", "staps@univ-boumerdes.dz", "+213 24 81 60 18", "Campus Sud, Faculty of Sciences", "L3-STAPS, Master Entraînement Sportif", "🏃", "#EF6C00"));
        f1.addDepartment(new Department("Chemistry", "Covers organic, inorganic and analytical chemistry.", "chimie@univ-boumerdes.dz", "+213 24 81 60 15", "Campus Sud, Faculty of Sciences", "L3-Chimie, Master Chimie Analytique", "🧪", "#AD1457"));
        faculties.add(f1);

        // 2. Faculty of Technology
        Faculty f2 = new Faculty(
                "Faculty of Technology ",
                "Located at Campus Ouest (West). Focuses on engineering fields like Civil, Mechanical and Process Engineering.",
                "ft@univ-boumerdes.dz",
                "+213 24 91 29 51",
                "Faculty of Technology, Campus Ouest, Boumerdes",
                36.7612, 3.4577
        );
        f2.addDepartment(new Department("Electrical Systems Engineering", "Covers Electronics, Automation (Automatique) and Electrotechnics.", "ise@univ-boumerdes.dz", "+213 24 81 60 21", "Campus Ouest, Faculty of Technology", "L3-Electronique, L3-Automatique, L3-Electrotechnique", "⚡", "#F9A825"));
        f2.addDepartment(new Department("Mechanical Engineering", "Covers Energetics, Industrial Maintenance and Mechanical Construction.", "meca@univ-boumerdes.dz", "+213 24 81 60 22", "Campus Ouest, Faculty of Technology", "L3-Energétique, L3-Maintenance Industrielle, L3-Construction Mécanique", "⚙️", "#4E342E"));
        f2.addDepartment(new Department("Civil Engineering", "Covers construction, public works and hydraulics.", "civil@univ-boumerdes.dz", "+213 24 81 60 23", "Campus Ouest, Faculty of Technology", "L3-Génie Civil, L3-Travaux Publics, L3-Hydraulique", "🏗️", "#37474F"));
        f2.addDepartment(new Department("Process Engineering", "Covers Food Technology, Environmental Engineering and Materials Science.", "procedes@univ-boumerdes.dz", "+213 24 81 60 24", "Campus Ouest, Faculty of Technology", "L3-Technologie Alimentaire, L3-Génie de l'Environnement, L3-Science des Matériaux", "🏭", "#00695C"));
        faculties.add(f2);

        // 3. Faculty of Hydrocarbons and Chemistry
        Faculty f3 = new Faculty(
                "Faculty of Hydrocarbons and Chemistry ",
                "Located at Campus Nord (North). Formerly known as INH. Covers petroleum, chemistry and geophysics engineering.",
                "fhc@univ-boumerdes.dz",
                "+213 24 79 51 62",
                "Faculty of Hydrocarbons, Campus Nord, Boumerdes",
                36.7680, 3.4755
        );
        f3.addDepartment(new Department("Deposits, Mining and Petroleum", "Covers reservoir engineering, mining and petroleum geology.", "gisements@univ-boumerdes.dz", "+213 24 81 60 31", "Campus Nord, FHC", "L3-Gisements Miniers, L3-Gisements Pétroliers", "🛢️", "#E65100"));
        f3.addDepartment(new Department("Hydrocarbon Transport and Equipment", "Covers pipeline transport, storage and hydrocarbon equipment.", "transport@univ-boumerdes.dz", "+213 24 81 60 32", "Campus Nord, FHC", "L3-Transport des Hydrocarbures, Master Équipements", "🔧", "#BF360C"));
        f3.addDepartment(new Department("Automation and Electrification of Industrial Processes", "Covers automation, electrification and control of industrial processes.", "automatisation@univ-boumerdes.dz", "+213 24 81 60 33", "Campus Nord, FHC", "L3-Automatisation, L3-Électrification Industrielle", "🤖", "#1A237E"));
        f3.addDepartment(new Department("Chemical and Pharmaceutical Process Engineering", "Covers chemical engineering, pharmaceutical processes and industrial chemistry.", "chimie-pharma@univ-boumerdes.dz", "+213 24 81 60 34", "Campus Nord, FHC", "L3-Génie Chimique, L3-Génie Pharmaceutique", "💊", "#880E4F"));
        f3.addDepartment(new Department("Geophysics and Earthquake Engineering", "Covers geophysics, seismic engineering and random phenomena.", "geophysique@univ-boumerdes.dz", "+213 24 81 60 35", "Campus Nord, FHC", "L3-Géophysique, Master Génie Parasismique", "🌍", "#4527A0"));
        f3.addDepartment(new Department("Hydrocarbon Economics and Marketing", "Covers economics, management and marketing of hydrocarbons.", "eco-hydro@univ-boumerdes.dz", "+213 24 81 60 36", "Campus Nord, FHC", "L3-Économie des Hydrocarbures, Master Commercialisation", "📈", "#1B5E20"));
        faculties.add(f3);

        // 4. Faculty of Economic Sciences
        Faculty f4 = new Faculty(
                "Faculty of Economic Sciences ",
                "Located at Campus Nord (North). Offers programs in economics, commerce, management and accounting.",
                "fsecg@univ-boumerdes.dz",
                "+213 24 81 60 40",
                "Faculty of Economics, Campus Nord, Boumerdes",
                36.7665, 3.4762
        );
        f4.addDepartment(new Department("Management Sciences", "Focuses on Management, Human Resources and Entrepreneurship.", "gestion@univ-boumerdes.dz", "+213 24 81 60 41", "Campus Nord, FSECG", "L3-Management, L3-RH, Master Entrepreneuriat", "👔", "#0D47A1"));
        f4.addDepartment(new Department("Commercial Sciences", "Covers Marketing, International Trade and Logistics.", "commerce@univ-boumerdes.dz", "+213 24 81 60 42", "Campus Nord, FSECG", "L3-Marketing, L3-Commerce International, L3-Logistique", "🛒", "#01579B"));
        f4.addDepartment(new Department("Economic Sciences", "Includes Applied Economics, Banking and Finance.", "economie@univ-boumerdes.dz", "+213 24 81 60 43", "Campus Nord, FSECG", "L3-Économie Appliquée, L3-Banque, Master Finance", "🏦", "#006064"));
        f4.addDepartment(new Department("Financial Sciences and Accounting", "Focuses on Audit, Control and Corporate Finance.", "finance@univ-boumerdes.dz", "+213 24 81 60 44", "Campus Nord, FSECG", "L3-Comptabilité, L3-Audit, Master Finance d'Entreprise", "💰", "#33691E"));
        faculties.add(f4);

        // 5. Faculty of Law and Political Science
        Faculty f5 = new Faculty(
                "Faculty of Law and Political Science",
                "Located at Boudouaou Campus. Covers public law, private law and political science.",
                "droit@univ-boumerdes.dz",
                "+213 24 81 60 50",
                "Faculty of Law, Boudouaou Campus",
                36.7300, 3.4000
        );
        f5.addDepartment(new Department("Public Law", "Focuses on administrative law, constitutional law and international public law.", "droit-public@univ-boumerdes.dz", "+213 24 81 60 51", "Boudouaou Campus, Faculty of Law", "L3-Droit Public, Master Droit Administratif, Master Droit International", "⚖️", "#B71C1C"));
        f5.addDepartment(new Department("Private Law", "Focuses on civil law, commercial law and business law.", "droit-prive@univ-boumerdes.dz", "+213 24 81 60 52", "Boudouaou Campus, Faculty of Law", "L3-Droit Privé, Master Droit Civil, Master Droit des Affaires", "📜", "#880E4F"));
        f5.addDepartment(new Department("Political Science", "Focuses on international relations and political organization.", "sc-politiques@univ-boumerdes.dz", "+213 24 81 60 53", "Boudouaou Campus, Faculty of Law", "L3-Sciences Politiques, Master Relations Internationales", "🏛️", "#4A148C"));
        faculties.add(f5);

        // 6. Faculty of Letters and Languages
        Faculty f6 = new Faculty(
                "Faculty of Letters and Languages",
                "Located at Boudouaou Campus. Covers Arabic, French and English language and literature.",
                "lettres@univ-boumerdes.dz",
                "+213 24 81 60 60",
                "Faculty of Letters, Boudouaou Campus",
                36.7300, 3.4010
        );
        f6.addDepartment(new Department("Arabic Language and Literature", "Covers classical and modern Arabic literature and linguistics.", "arabe@univ-boumerdes.dz", "+213 24 81 60 61", "Boudouaou Campus, Faculty of Letters", "L3-Langue Arabe, Master Littérature Arabe, Master Linguistique", "📖", "#1A237E"));
        f6.addDepartment(new Department("French Language", "Covers French language, literature and didactics.", "francais@univ-boumerdes.dz", "+213 24 81 60 62", "Boudouaou Campus, Faculty of Letters", "L3-Langue Française, Master FLE, Master Littérature Française", "🗼", "#004D40"));
        f6.addDepartment(new Department("English Language", "Covers English language, literature and translation.", "anglais@univ-boumerdes.dz", "+213 24 81 60 63", "Boudouaou Campus, Faculty of Letters", "L3-Langue Anglaise, Master Traduction, Master Littérature Anglaise", "🌐", "#BF360C"));
        faculties.add(f6);

        // 7. IGEE
        Faculty f9 = new Faculty(
                "IGEE – Institute of Electrical and Electronic Engineering",
                "Located in Boumerdès. Specialized in electrical and electronic engineering with English-based technical education.",
                "igee@univ-boumerdes.dz",
                "+213 24 79 57 63",
                "IGEE, Boulevard de l'Indépendance, Boumerdes",
                36.7588, 3.4727
        );
        f9.addDepartment(new Department("Fundamental Teaching", "Covers basic sciences like mathematics, physics, and signals.", "fundamental@igee-boumerdes.dz", "+213 24 81 60 91", "IGEE, Boumerdès", "Mathematics, Physics, Signals & Systems", "📚", "#6A1B9A"));
        f9.addDepartment(new Department("Electronics", "Focuses on electronic systems, embedded systems, and telecommunications.", "electronics@igee-boumerdes.dz", "+213 24 81 60 92", "IGEE, Boumerdès", "Electronic Systems, Embedded Systems, Telecommunications", "📡", "#00838F"));
        f9.addDepartment(new Department("Electrotechnics & Automatic", "Deals with electrical power systems, control, and industrial automation.", "electro@igee-boumerdes.dz", "+213 24 81 60 93", "IGEE, Boumerdès", "Electrical Power Systems, Control, Industrial Automation", "⚡", "#F9A825"));
        faculties.add(f9);

        return faculties;
    }
}