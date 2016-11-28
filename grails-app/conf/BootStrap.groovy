import thesmartguage.Comments
import thesmartguage.MinistryDetails
import thesmartguage.Rating
import thesmartguage.Role
import thesmartguage.StateDetails
import thesmartguage.User

class BootStrap {

    def init = { servletContext ->
        /*Ministry of Defence*/
        def ministry = new MinistryDetails(firstName: "Dan",lastName: "Ali",fullName: "Dan Ali",ministryDesignation: "Minister of Defence", imageName: "MD.jpg")
        ministry.bio = "Mansur Dan Ali was born August 25 1959 is a retired Nigerian Army Brigadier General and current Minister of Defence of Nigeria appointed by President Muhammadu Buhari in November 2015. <br/> " +
                "He attended Birnin Magaji Town Primary School (1966 -1972) for his elementary education and Government Secondary School, Shinkafi (1972-1977) for his secondary education. He received his Higher National Diploma (HND) in Photogrammetric and Surveying from Kaduna Polytechnic (1977-1982) and possesses a Master\'s Degrees in Public Policy and Administration (MPPA) from Bayero University Kano (2004-2005) and a Master\'s Degree in Security Studies from the Bangladesh University of Professionals (2009) <br/> " +
                "Dan Ali was commissioned as a 2nd Lieutenant in the Nigerian Army in 1984 through the Short Service Commission at the Nigerian Defence Academy. Dan-Ali has served in different command and staff capacities, some of which include commanding the Nigerian contingent supporting the United Nations Africa Hybrid Mission in Sudan. Dan Ali was on the Directing Staff of the Armed Forces Command and Staff College, Jaji from 2003 -2005 and was Chief Instructor (CI) at the Nigerian Defence Academy in 2010. He was also Acting Director Military Training before getting posted to the Ministry of Defence\'s Logistics Department as Deputy Director. He retired from the Nigerian Army on August 30, 2013."
        ministry.mandate = 'Vision <br/> ' +
                '\"In recognition of the challenges of the millennium, a Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications, capable of fulfilling its constitutional responsibilities and performing its international peace-keeping role proudly and efficiently.\" <br/> ' +
                'Mission <br/> ' +
                '\"To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional, mission-capable and mission-ready Armed Forces, for the defence of National territory maritime interest, airspace and the protection and defence of the constitution of the Federal Republic of Nigeria, and to contribute to peace-making and peace-keeping duties worldwide under sub-regional and global organizations of which Nigeria is a member.\"'
        ministry.q1 ='Is the Nigerian Armed Forces always well-trained in and capable of fulfilling all aspects of military operations?';
        ministry.q2 ='Is the Nigerian Armed Forces always operationally ready in terms of planning, communication, and equipment allocation to maintain national security?';
        ministry.q3 ='Does the Nigerian Armed Forces receive adequate support and compensation to sustain their health and well-being?';
        ministry.q4 ='Are subsequent measures being taken by the Armed Forces in developing the country’s defense industries?';
        ministry.q5 ='Are peace-making and peace-keeping initiatives being rolled out with sub- regional and global organizations to ensure national stability?';
        ministry.save(flush: true)

        /*Minister of Education*/
        def ministry1 = new MinistryDetails(firstName: "Adamu",lastName: "Adamu",fullName: "Adamu Adamu",ministryDesignation: "Minister of Education", imageName: "ME.jpg")
        ministry1.bio = "Mallam Adamu Adamu was born in Azare, Katagum Local Government Area of Bauchi State. <br/> " +
                "He attended Government Secondary School Azare. He obtained his B.Sc Degree in Accounting from Ahmadu Bello University, Zaria and also has a Masters Degree in Journalism from Columbia University. He started his working career as an accountant before joining the New Nigerian Newspapers as a Special Correspondent and Member, Editorial Board. He rose to become the Deputy Editor of the Daily Newspaper. <br/> " +
                "Between 2000 and 2001, he was Secretary of Arewa Consultative Forum, ACF; Secretary of the Board of Trustees of the defunct Congress for Progressive Change (CPC), and Member/Secretary, Strategy Committee of the APC Presidential Transition Committee. Adamu Adamu is fluent in Arabic, Persian and French. <br/>" +
                "He was appointed Minister of Education in 2015 by President Buhari.";
        ministry1.mandate = 'VISION <br/> ' +
                'To become an economic model, delivering sound education for public good. <br/> ' +
                'MISSION <br/> ' +
                'To use education for fostering development of all Nigerian Citizens to their full potentials in the promotion of a strong, democratic, egalitarian, prosperous, indivisible and indissoluble sovereign nation under God.'
        ministry1.q1 ='Are research and studies being conducted and used as references in creating educational plan and policies?';
        ministry1.q2 ='Are initiatives being rolled out to assess the quality of education in the country?';
        ministry1.q3 ='Is the National Council on Education (NCE) able to harmonize educational policies and procedures?';
        ministry1.q4 ='Are our educational policies at par with the international standard?';
        ministry1.q5 ='Are existing curricula and syllabuses applicable on a national scale?';
        ministry1.save(flush: true)

        /*Minister of Environment*/
        def ministry2 = new MinistryDetails(firstName: "Amina",lastName: "Mohammed",fullName: "Amina Mohammed",ministryDesignation: "Minister of Environment", imageName: "MEV.jpg")
        ministry2.bio = "Amina J. Mohammed is a key player in the post-2015 development process, serving as the Special Adviser to UN Secretary-General Ban Ki-Moon on post-2015 development planning. In this role, she acts as the link between the Secretary-General, his High Level Panel of Eminent Persons (HLP), and the General Assembly’s Open Working Group (OWG), among other stakeholders. <br/> " +
                "Prior to this position, Ms. Mohammed served as Founder and CEO of the Center for Development Policy Solutions and as an Adjunct Professor for the Master’s in Development Practice program at Columbia University. Previously, she acted as the Senior Special Assistant to the President of Nigeria on the Millennium Development Goals after serving three presidents over a period of six years. In 2005, she was charged with the coordination of Nigeria’s debt relief funds toward the achievement of the MDGs. From 2002-2005, Ms. Mohammed coordinated the Task Force on Gender and Education for the UN Millennium Project. <br/> " +
                "Ms. Mohammed was appointed Hon Minister of the Environment by President Buhari when he swore in his new Cabinet on 11 November 2015. <br/>" +
                "Amina J. Mohammed is a key player in the post-2015 development process, serving as the Special Adviser to UN Secretary-General Ban Ki-Moon on post-2015 development planning. In this role, she acts as the link between the Secretary-General, his High Level Panel of Eminent Persons (HLP), and the General Assembly’s Open Working Group (OWG), among other stakeholders. <br/>" +
                "Prior to this position, Ms. Mohammed served as Founder and CEO of the Center for Development Policy Solutions and as an Adjunct Professor for the Master’s in Development Practice program at Columbia University. Previously, she acted as the Senior Special Assistant to the President of Nigeria on the Millennium Development Goals after serving three presidents over a period of six years. In 2005, she was charged with the coordination of Nigeria’s debt relief funds toward the achievement of the MDGs. From 2002-2005, Ms. Mohammed coordinated the Task Force on Gender and Education for the UN Millennium Project. <br/>" +
                "Ms. Mohammed was appointed Hon Minister of the Environment by President Buhari when he swore in his new Cabinet on 11 November 2015. <br/>" +
                "Amina J. Mohammed is a key player in the post-2015 development process, serving as the Special Adviser to UN Secretary-General Ban Ki-Moon on post-2015 development planning. In this role, she acts as the link between the Secretary-General, his High Level Panel of Eminent Persons (HLP), and the General Assembly’s Open Working Group (OWG), among other stakeholders. <br/>" +
                "Prior to this position, Ms. Mohammed served as Founder and CEO of the Center for Development Policy Solutions and as an Adjunct Professor for the Master’s in Development Practice program at Columbia University. Previously, she acted as the Senior Special Assistant to the President of Nigeria on the Millennium Development Goals after serving three presidents over a period of six years. In 2005, she was charged with the coordination of Nigeria’s debt relief funds toward the achievement of the MDGs. From 2002-2005, Ms. Mohammed coordinated the Task Force on Gender and Education for the UN Millennium Project. <br/>" +
                "Ms. Mohammed was appointed Hon Minister of the Environment by President Buhari when he swore in his new Cabinet on 11 N.";
        ministry2.mandate = 'VISION <br/> ' +
                'To ensure a Nigeria that develops in harmony with the environment. <br/> ' +
                'MISSION <br/> ' +
                'To ensure environmental protection and natural resources conservation for a sustainable development.';
        ministry2.q1 ='Are the master plans prepared by the Ministry in accordance with the provisions on the National Policy on Environment?';
        ministry2.q2 ='Is the Ministry able to provide relevant and useful advise on National Environmental Policies, priorities, and all other activities affecting the environment and natural resources?';
        ministry2.q3 ='Are there efforts that strengthen Nigeria\'s cooperation with other countries and international bodies with regard to the environmental science and conservation technology?';
        ministry2.q4 ='Is the Ministry active in initiating collaboration with the Federal and State Ministries, local government bodies, and research agencies on matters relating to the protection of the environment?';
        ministry2.q5 ='Is the monitoring and enforcement of environmental protection measures effective and able to produce desirable results?';
        ministry2.save(flush: true)

        /*Minister of Finance*/
        def ministry3 = new MinistryDetails(firstName: "Kemi",lastName: "Adeosun",fullName: "Kemi Adeosun",ministryDesignation: "Minister of Finance", imageName: "MF.jpg")
        ministry3.bio = "Kemi was born in 1967 in London, United Kingdom to Nigerian parents from Ogun State. [5] She earned a Bachelor of Science degree in Economics from the University of East London and a Postgraduate Diploma in Public Financial Management from the University of London. She qualified as a Chartered Accountant with the Institute of Chartered Accountants England and Wales in 1994. "
        ministry3.mandate = 'VISION <br/> ' +
                '/“To be the First in Service Delivery./” <br/> <br/> ' +
                'MISSION <br/> ' +
                '/“To manage the Nation’s finances in an open, transparent, accountable and efficient manner that delivers on the country’s development priorities./”';
        ministry3.q1 ='Does the Ministry develop long-term and short-term projects and plans that can contribute to a stable economy and establish a good standard of living in the country?';
        ministry3.q2 ='Are existing systems able to create an economical and efficient tax environment?';
        ministry3.q3 ='Is the Ministry able to foster a collaborative environment built on trust, integrity, professionalism, and efficiency?';
        ministry3.q4 ='Is the Ministry transparent with relevant government operations and data on the country’s financial stability?';
        ministry3.q5 ='Is the Ministry able to deliver a reliable service in all its interactions with its stakeholders?';
        ministry3.save(flush: true)

        /*Minister of Foreign Affairs*/
        def ministry4 = new MinistryDetails(firstName: "Geoffrey",lastName: "Onyema",fullName: "Geoffrey Onyema",ministryDesignation: "Minister of Foreign Affairs", imageName: "MFA.jpg")
        ministry4.bio = "Geoffrey Onyema was born February 2, 1956 in Enugu State. He is married with three children. <br/>" +
                "He obtaines is Bachelor of Arts (BA), Political Science, from Columbia University (Columbia College), New York, USA, (1977), also has a Bachelor of Arts (BA), Law, Cambridge University (St. John’s College), Cambridge, United Kingdom (1980), Master of Laws (LL.M), Law, University of London (London School of Economics and Political Science (LSE), London, United Kingdom (1982), Master of Arts (MA), Law, Cambridge University (St. John’s College), Cambridge, United Kingdom (1984). <br/>" +
                "He started as a Research Officer, Nigerian Law Reform Commission, Lagos, Nigeria, (1983-1984) and work as Law Practitioner, with Mogboh and Associates, Enugu, Nigeria (1984-1985) <br/>" +
                "In 1985 he work Assistant Program Officer, Development Cooperation and External Relations, Bureau for Africa and Western Asia, and later become the program officer from 1986 -1990. He later became the Senior Program Officer, Development Cooperation and External Relations Bureau for Africa. Senior Counsellor, Development Cooperation and External Relations Bureau for Africa, Deputy Director, Cooperation for Development Bureau for Africa in 1998, Acting Director, Cooperation for Development Bureau for Africa (The Bureau was renamed the Economic Development Bureau for Africa at the end of 2003) <br/>" +
                "In 2006 became Assistant Director General, Coordination Sector for External Relations, Industry, Communications and Public Outreach. Responsible for: coordinating relations with United Nations (UN) organizations, other intergovernmental organizations, industry, non- governmental organizations (NGOs); and responsible for communication, public outreach, media relations and gender focal point. * In this capacity, he initiated, in 2008, with the International Federation of Reproduction Rights Organizations (IFRRO), the process within WIPO that culminated in the adoption of the Marrakesh Treaty to Facilitate Access to Published Works for Persons Who are Blind, Visually Impaired or Otherwise Print Disabled.";
        ministry4.mandate = 'VISION <br/> ' +
                'To be an excellent Foreign Service that safeguards and advances Singapore’s interests <br/> ' +
                'MISSION <br/> ' +
                'MFA is committed to the effective and timely formulation, implementation, and communication of policies that: <br/>' +
                'Uphold Singapore’s sovereignty <br/>' +
                'Promote a peaceful regional environment <br/>' +
                'Sustain Singapore’s relevance internationally <br/>'+
                'Expand Singapore’s political and economic space<br/>' +
                'Share our developmental experience as a responsible global citizen <br/>' +
                'Connect with Singaporeans travelling and living overseas, assist them in times of need';
        ministry4.q1 ='Are there enough initiatives that promote a peaceful and harmonious environment among all stakeholders of the country?';
        ministry4.q2 ='Does the Ministry regularly implement initiatives that help strengthen Nigeria’s relevance internationally?';
        ministry4.q3 ='Is the Ministry active in developing and expanding Nigeria’s political and economic influence in the global space?';
        ministry4.q4 ='Is the Ministry able to formulate, implement, and communicate policies that reflect the concerns and issues of its stakeholders?';
        ministry4.q5 ='Is the Ministry able to assist Nigerian travelling and living overseas in matters related to their citizenship and welfare?';
        ministry4.save(flush: true)

        /*Minister of Health*/
        def ministry5 = new MinistryDetails(firstName: "Isaac",lastName: "Adewole",fullName: "Isaac Adewole",ministryDesignation: "Minister of Health", imageName: "MH.jpg")
        ministry5.bio = "He attended Ilesha Grammar School and proceeded to the University of Ibadan where he graduated with a Bachelor’s Degree in Medicine in 1978. <br/>" +
                "He became a Professor of Medicine from the College of Medicine, University of Ibadan in 1997, and was appointed Provost, College of Medicine in 2002. <br/>" +
                "Professor Adewole has worked at the University College Hospital (UCH) Ibadan in different capacities. Until his nomination as a Minister, he was the Vice Chancellor of the University of Ibadan, a position he has occupied since 2010.He is similarly an adjunct professor, North-Western University, Chicago, Illinois, USA – a position he has held since 2010. <br/>" +
                "Professor Adewole is a recipient of several scholarships, fellowships and awards.";
        ministry5.mandate = 'VISION <br/> ' +
                'A World-Class Government Institution that ensures a healthy Nigeria <br/> ' +
                'MISSION <br/> ' +
                'To develop and implement policies that strengthen the national health system for effective, efficient, accessible and affordable delivery of health services in partnership with other stakeholders.';
        ministry5.q1 ='Are research and studies being conducted and used as references in designing and delivering health services and policies to all Nigerians?';
        ministry5.q2 ='Is the Ministry active in conducting awareness campaigns on pressing issues and problems of health among Nigerians?';
        ministry5.q3 ='Are there enough initiatives from the Ministry that assess the quality of health and well being among Nigerians?';
        ministry5.q4 ='Are our health services and policies at par with the international standard?';
        ministry5.q5 ='Are our health services reflective of health concerns and issues experienced by Nigerians in various parts of the country?';
        ministry5.save(flush: true)

        /*Minister of Information*/
        def ministry6 = new MinistryDetails(firstName: "Lai",lastName: "Mohammed",fullName: "Lai Mohammed",ministryDesignation: "Minister of Information", imageName: "MI.jpg")
        ministry6.bio = "He was born into the family of Alh Mohammed Adekeye in 1952. He earned a bachelor’s degree in French from Obafemi Awolowo University, Ile-Ife in 1975 and Law degrees from the University of Lagos and the Nigerian Law School in 1986[2] and Alhaji Lai Mohammed as a Lawyer co-founded the legal firm of Edu & Mohammed as a Senior Partner in 1989. n October 2002, Alhaji Lai Mohammed was a candidate for governor in the April 2003 Kwara State elections on the Alliance for Democracy platform. He was assaulted and five vehicles in his convoy were smashed in front of Senator Suleiman Ajadi’s campaign office at Oke-Onigbin during a festivity.[3] <br/>" +
                "Lai Mohammed an active politician and was the National Publicity Secretary of All Progressive Congress (APC) in Nigeria. He was on November 11, 2015 sworn in by President Muhammadu Buhari as Minister of Information and Culture following his appointment and successful screening by the Nigerian Senate. He is known for his exaggeration of facts so as to score cheap political points. Lai Mohammed is the current Nigeria’s Minister of Information and Culture, a Nigerian lawyer and former National Publicity Secretary of the All Progressives Congress (APC).";
        ministry6.mandate = 'Vision: <br/> ' +
                'To build a dynamic and participatory public information system that fosters national unity and positive values of the Nigerian people and her culture. <br/> ' +
                'Mandate: <br/> ' +
                'Management of the image, reputation and the promotion of the culture of the people and Government of Nigeria through a dynamic public information system that facilitates access by the citizens and the global community to credible and timely information about our nation.';
        ministry6.q1 ='Is the Ministry able to create an information dissemination scheme that includes both metropolitan and rural areas of the country?';
        ministry6.q2 ='Is the information made available by the Ministry relevant to the welfare and culture of all Nigerians?';
        ministry6.q3 ='Does the Ministry ensure that information available to its citizens is timely and always up to date?';
        ministry6.q4 ='Is the Ministry able to develop information channels that are accessible to all Nigerians?';
        ministry6.q5 ='Does the Ministry provide enough avenues for citizen participation and discussion on information made available?';
        ministry6.save(flush: true)

        /*Minister of Interior*/
        def ministry7 = new MinistryDetails(firstName: "Abdulrahman",lastName: "Dambazau",fullName: "Abdulrahman Dambazau",ministryDesignation: "Minister of Interior", imageName: "MIT.jpg")
        ministry7.bio = "Born March 14, 1954) is a retired Nigerian Army Lieutenant General and Nigeria’s current Minister of the Interior. Dambazau served asChief of Army Staff (COAS) between 2008 and 2010, succeeding Lieutenant General Luka Yusuf. <br/>" +
                "Dambazau’s secondary education took place at Barewa College, Zaria where he graduated from in 1974.[1] He proceeded to the Nigerian Defence Academy Kaduna as a member of the 17 Regular Combatant Course. He was commissioned as a Second Lieutenant into the Infantry Corps of the Nigerian Army in June 1977.[1] In 1979, Dambazau attended the US Army Military Police School, Fort McClellan.";
        ministry7.mandate = 'VISION <br/> ' +
                'To provide internal security service in accordance with international best practice. <br/> ' +
                'MISSION <br/> ' +
                'To render to Nigerians and foreigners alike, diverse internal security and other ancillary services that are highly qualitative, efficient, courteous and transparent.';
        ministry7.q1 ='Is the Ministry always operationally ready in terms of planning, communication, and resource allocation for possible occurrence of national emergencies?';
        ministry7.q2 ='Is the Ministry able to provide all relevant services concerning the citizenship of all Nigerians?';
        ministry7.q3 ='Are subsequent measures being taken to ensure the security of lives and properties of all Nigerians?';
        ministry7.q4 ='Is the Ministry able to recruit officers and men of integrity and with dedication to ensure the security of all Nigerian citizens?';
        ministry7.q5 ='Is the internal security service diverse and at par with international standards and best practices?';
        ministry7.save(flush: true)

        /*Minister of Justice & Attorney-General*/
        def ministry8 = new MinistryDetails(firstName: "Abubakar",lastName: "Malami",fullName: "Abubakar Malami",ministryDesignation: "Minister of Justice & Attorney-General", imageName: "MJ.jpg")
        ministry8.bio = "Abubakar Malami (SAN), is a Nigerian politician and lawyer who currently doubles as Nigeria’s Minister for Justice and Attorney-General since November 15, 2015. <br/>" +
                "Abubakar Malami was born on April 17, 1967 in Birnin Kebbi, the capital of Kebbi State, Northern Nigeria. His early formal education began at Nassarawa Primary School, Birnin Kebbi before he completed his secondary school education at College of Arts and Arabic Studies. In 1991, he graduated from Usmanu Danfodiyo University where he studied Law and was called to the bar in 1992. Abubakar is an alumnus of the University of Maiduguri where he obtained his Master’s degree in Public Administration in 1994. <br/>" +
                "As a legal practitioner, Abubakar has served in various capacities including being a councel and magistrate in Kebbi State and as National Legal Adviser of the defunt Congress for Progressive Change.[5] Abubakar Malami was actively involved in the formation of the All Progressives Congress in 2013 as the resource person to the Manifesto Drafting Sub-Committee of Inter Joint Party Merger Committees between the Congress for Progressive Change (CPC), Action Congress of Nigeria (ACN) and the All Nigeria Peoples Party (ANPP). <br/>" +
                "In 2014, Abubakar contested for the governorship ticket of the All Progressives Congress in Kebbi State but lost the primaries to Atiku Bugudu. On November 11, 2015, Abubakar was appointed as Minister for Justice and Attorney-General of the Federal Republic of Nigeria thus making him the youngest minister in Muhammadu Buhari’s cabinet.";
        ministry8.mandate = 'VISION <br/> ' +
                'To make justice accessible to all consistent with the ideals of democracy and the rule of law. <br/> ' +
                'The ultimate aim is to reposition the Ministry at the centre of government activity by developing core competences in the following broad areas: constitutional cases, advisory services, commercial negotiation, human rights protection, legal aid, mediation, legislative drafting, property management, Information Technology, litigation, as well as in emerging fields such as environmental law and public-private partnerships (PPPs). <br/>' +
                'MISSION <br/> ' +
                'To maintain the highest standards of Professionalism loyalty to the ideals of fairness and Justice and the sustenance of a Healthy relationship between all Arms and Tiers of Government.';
        ministry8.q1 ='Is the Ministry able to develop its competencies on core fields relating to law?';
        ministry8.q2 ='Are the laws and legal policies created by the Ministry reflective of pressing issues and concerns of Nigerian citizens?';
        ministry8.q3 ='Is the Ministry able to represent the country well and uphold its integrity in international legal activities?';
        ministry8.q4 ='Does the Ministry regularly assess activities of law enforcement agencies and quasi-legal institutions on their compliance with Constitutional standards?';
        ministry8.q5 ='Is the Ministry able to foster a harmonious relationship between the Executive and Judicial arms of the Government on matters relating to citizen welfare?';
        ministry8.save(flush: true)

        /*Minister of Niger Delta*/
        def ministry9 = new MinistryDetails(firstName: "Usani",lastName: "Uguru",fullName: "Usani Uguru",ministryDesignation: "Minister of Niger Delta", imageName: "MN.jpg")
        ministry9.bio = "Mr. Usani Uguru hails from Cross River State. He holds a Bachelor of Science Degree in Geography from the University of Jos, Masters Degree in Business Administration from the University of Calabar and another Masters degree in Globalisation and Development from the University of London. <br/>" +
                "He is currently a Ph.D student of the Nigerian Defence Academy. <br/>" +
                "Usani was the Coordinating Director of Fuzel Mining and Construction Company Limited. <br/>" +
                "He was appointed Minister of Niger Delta in 2015 by President Buhari.";
        ministry9.mandate = 'VISION <br/> ' +
                'The Vision of the Ministry is to serve as the primary vehicle for the execution of Government’s plans and programmes for rapid socio-economic development of the Region. <br/> ' +
                'MISSION <br/> ' +
                'To formulate and execute plans, programmes and other initiatives as well as to coordinate the activities of Agencies, Communities, Donors and other relevant Stakeholders involved in the development of the Region.';
        ministry9.q1 ='Is the Ministry able to ensure the implementation of government policies on the development of the Niger Delta Region?';
        ministry9.q2 ='Are there enough educational and enlightenment projects that aim to hone human potential and development?';
        ministry9.q3 ='Is the Ministry able to involve private sectors in initiatives mainly for the development of the Region?';
        ministry9.q4 ='Is the Ministry able to coordinate with different bodies in ensuring proper management of environmental resources?';
        ministry9.q5 ='Are adequate measures being taken to ensure peace, stability, and security of the Region while harnessing economic potentials?';
        ministry9.save(flush: true)


        /*Minister of Science and Technology*/
        def ministry10 = new MinistryDetails(firstName: "Ogbonaya",lastName: "Onu",fullName: "Ogbonaya Onu",ministryDesignation: "Minister of Science and Technology", imageName: "MST.jpg")
        ministry10.bio = "Ogbonnaya Onu was born December 1, 1951, to the family of His Royal Highness, Late Eze David Aba Onu, the Eze Adu of Uburu in Ohaozara Local Government Area";
        ministry10.mandate = 'VISION <br/> ' +
                'To make Nigeria one of the acknowledged leaders of the scientifically and technologically developed nations of the world. <br/> ' +
                'The Ministry’s Vision, Mission and mandate which are distill into the above stated goals are presently through various specialized Research and Development (R&D) projects in our parastatal and agencies and particularly through the FMST flagship programmes The FMST flagships are as listed below: <br/>' +
                '<ul><li>Biotechnology<li><li>Information and Communications Technology</li><li>Space Technology</li><li>Power and Nuclear Energy</li><li>Engineering infrastructure, Health, Traditional medicine, Education, Housing, Environment</li></ui> <br/>' +
                'MISSION <br/> ' +
                'To facilitate the development and deployment of science and technology apparatus to enhance the pace of socio-economic development of the country through appropriate technological inputs into productive activities.';
        ministry10.q1 ='Is the Ministry able to review the National Policy on Science, Technology, and Innovation and ensure that it adheres to the objectives of Vision 20:20?';
        ministry10.q2 ='Are enough researches and studies being conducted to drive innovation on science and technology?';
        ministry10.q3 ='Is the Ministry able to forward the application of natural medicine resources and technologies for development in the health sector?';
        ministry10.q4 ='Are there initiatives that help strengthen the country’s technology infrastructure and knowledge base on science and innovation?';
        ministry10.q5 ='Is the Ministry creating enough campaigns to promote the benefits of technological innovation in industrial and manufacturing sectors in the creation of wealth?';
        ministry10.save(flush: true)


        /*Minister of Solid Mineralst*/
        def ministry11 = new MinistryDetails(firstName: "Kayode",lastName: "Fayemi",fullName: "Kayode Fayemi",ministryDesignation: "Minister of Solid Mineralst", imageName: "MSM.jpg")
        ministry11.bio = "Kayode Fayemi is the former Governor of Ekiti State and a native of Isan-Ekiti in Oye Local Government of Ekiti State, Nigeria. He is currently the Minister of Solid Minerals Development. He attended Christ’s School Ado Ekiti from 1975-1980 and received degrees in History, Politics and International Relations from the Universities of Lagos and Ife in Nigeria and his Doctorate in War Studies from the prestigious King’s College, University of London, England, specializing in civil-military relations. His research and policy interests include: Democratisation, Constitutionalism, Security Sector Governance, and Regionalism in the Global Context.";
        ministry11.mandate = 'VISION <br/> ' +
                'To transform Nigerian Mineral and Metal Sector into irresistible Mining destination for global capital, attracting foreign direct investment to grow the sector to optimum level. <br/> ' +
                'MISSION <br/> ' +
                'Exploitation of the mineral endowment spread across the nation and the establishment of a vibrant metal industry for wealth creation, employment generation, poverty reduction, promotion of rural economy and significant contribution to the gross domestic product of Nigeria.';
        ministry11.q1 ='Is the Ministry creating policies that reflect issues and concerns in mineral and metal sector?';
        ministry11.q2 ='Is the Ministry able to deliver effective and efficient operations in the harnessing of solid minerals?';
        ministry11.q3 ='Does the Ministry regularly conduct awareness campaigns on the benefits of the mineral and metal sector in reducing poverty and generating employment?';
        ministry11.q4 ='Are there enough efforts from the Ministry in developing the revenue stream of the minerals sector?';
        ministry11.q5 ='Is the Ministry active in seeking foreign investment for the growth and development of the mineral and metal sector?';
        ministry11.save(flush: true)

        /*Minister of State, Aviation*/
        def ministry12 = new MinistryDetails(firstName: "Sen Hadi",lastName: "Sirika",fullName: "Sen Hadi Sirika",ministryDesignation: "Minister of State, Aviation", imageName: "MSA.jpg")
        ministry12.bio = 'Sen. Sirika Hadi is a former pilot, Former General Manager Katsina State Transport Authority, Former Member House of Representative, and Senator of the Federal Republic of Nigeria, who represents Katsina North Senatorial District under the platform of Congress for Progressive Change. Sirika held the position of (Vice-Chairman) of the Millennium Development Goals (MGDs) Committee set by the Nigerian Senate. He became a senator in 2011. He is currently the minister for aviation of the Federal Republic of Nigeria. <br/> ' +
                'Career. <br/> ' +
                'As a former pilot, Sirika is a member of the Senate Committee on Aviation. He bares his mind, undisguised, about how not to own a private aircraft through corrupt means. He also spoke about other issues bordering on piloting and the Aviation sector, in an interview with Jamila Nuhu Musa and Augustine Aminu. He also spoke on President Jonathan’s poor grasp of his brief and on a number topical issue. <br/> ' +
                'On the other hand, Nigeria cannot make the desired progress in the comity of nations under the leadership of the ruling People’s Democratic Party, a Congress for Progressive Change lawmaker, Senator Hadi Sirika, has said. Speaking in an exclusive interview with LEADERSHIP WEEKEND, Sirika, who represents Katsina North senatorial district of Katsina State, said that the party had run out of ideas on how to move the nation forward despite leading the country in the last 13 years. [3] In his interview with Soni Daniel and Ruth Choji, Sirika, a pilot and long standing ally of former Head of State, Gen. Muhammadu Buhari, speaks on how to enthrone credible and responsive leadership in Nigeria and how to salvage the Nigerian aviation industry. <br/> ' +
                'An elder of the opposition Congress for Progressive Change (CPC), Senator Hadi Abubakar Sirika has disclosed that elders of the party have succeeded in convincing General Muhammadu Buhari to run as president in 2015. Senator Sirika, who made the disclosure in Daura on Sunday while donating vehicles to his constituents from the response they have received from so far, the General, will run.';
        ministry12.mandate = 'VISION <br/> ' +
                'To be the best Aviation Industry in Africa and one of the best in the world <br/> ' +
                'MISSION <br/> ' +
                'To build a safe, secured and efficient aviation industry focused on making Nigeria a hub that meets International Standards and Best Practices for the African continent.';
        ministry12.q1 ='Is the Ministry able to develop a National Aviation Master Plan that is reflective of concerns and issues of the aviation industry?';
        ministry12.q2 ='Is the Ministry able to develop a system that efficiently collects store and analyze meteorological data for reference on aviation protocols?';
        ministry12.q3 ='Are there initiatives that aim to upgrade aviation equipment and infrastructure?';
        ministry12.q4 ='Are the standards of aviation at par with international standards and best practices?';
        ministry12.q5 ='Are the aviation safety and security measures in compliance with the standards and requirements of the International Civil Aviation Organization (ICAO) and the World Meteorological Organization (CMO)?';
        ministry12.save(flush: true)

        /*Minister of Power, Works and Housing*/
        def ministry13 = new MinistryDetails(firstName: "Babatunde",lastName: "Fashola",fullName: "Babatunde Fashola",ministryDesignation: "Minister of Power, Works and Housing", imageName: "MP.jpg")
        ministry13.bio = 'Babatunde Fashola born 28 June 1963) is Nigeria’s Federal Minister of Power, Works and Housing and was Lagos State Governor from May 29, 2007 to May 29, 2015.[1] As a candidate of the Action Congress party, now known as the All Progressives Congress, Fashola succeeded Bola Ahmed Tinubu, on 14 April 2007,[1] and was sworn in on 29 May 2007.[1] He was re-elected on 26 April 2011.[3] On November 11th 2015, he was appointed by President Muhammadu Buhari to be the Minister of Power, Works and Housing. <br/> ' +
                'He attended Birch Freeman High school Lagos and Igbobi College Lagos. He studied Law at the University of Benin from where he graduated with a Bachelor of Laws, LL.B.(Hon), degree in 1987.';
        ministry13.mandate = 'VISION <br/> ' +
                'A robust and sustainable power sector that fully supports the socio – economic needs of the Nation and contributes to the emergence of Nigeria as one of the top twenty economies of the world by the Year 2020. <br/> ' +
                'MISSION <br/> ' +
                'To provide the Nation with adequate and reliable power supply by implementing generation, transmission and distribution projects in the sector and facilitating the emergence of a private sector led competitive and efficient electric power industry. <br/>' +
                'The ministry of works is charged with several statutory responsibilities among which are <br/>' +
                '<ul><li>Federal highways construction and rehabilitation</li><li>Federal highway planning and design</li><li>Monitoring and maintenance of federal road and bridges nationwide</li><li>Provision of Engineering infrastructure</li><li>Surveying and mapping the nation internal and international boundaries</li></ul>';
        ministry13.q1 ='Is the Ministry able to develop an effective system in conducting investigation on electrical accidents to ensure safety in electricity industry?';
        ministry13.q2 ='Is the Ministry able to conduct research and development in the power sector for effective planning?';
        ministry13.q3 ='Is the Ministry able to rollout projects on improvement of infrastructure and national roads?';
        ministry13.q4 ='Are there initiatives that address increasing demand for housing?';
        ministry13.q5 ='Is the Ministry able to develop a master plan that aim to provide safe sanitary conditions for both urban and rural areas of Nigeria?';
        ministry13.save(flush: true)

        /*Minister of Budget & National Planning*/
        def ministry14 = new MinistryDetails(firstName: "Udo Udo",lastName: "Udoma",fullName: "Udo Udo Udoma",ministryDesignation: "Minister of Budget & National Planning", imageName: "MB.jpg")
        ministry14.bio = 'Udoma Udo Udoma was elected Senator for the Akwa-Ibom South constituency of Akwa-Ibom State, Nigeria at the start of the Nigerian Fourth Republic, running on the People’s Democratic Party (PDP) platform. He took office on 29 May 1999. He was re-elected in April 2003, again running on the PDP platform. After taking his seat in the Senate in June 1999, he was appointed to committees on Public Accounts, Judiciary, Banking & Currency, Science & technology, Privatization and Drug & Narcotics (vice chairman). <br/> ' +
                'Udoma was appointed Minister of Budget and Planning in 2015 by President Muhammadu Buhari.';
        ministry14.mandate = 'VISION <br/> ' +
                'To be the most efficient planning institution that guides the growth and development of Nigerian economy to be and among the leading economies in the world. <br/> ' +
                'MISSION <br/> ' +
                'To pro-actively determine and efficiently advise on matters relating to national development and overall management of the economy for positive growth; and to ensure that plans and policies are properly implemented by all relevant stakeholders.';
        ministry14.q1 ='Are the priorities set by the Ministry reflective of concerns on a national level and those of the goals of other government agencies?';
        ministry14.q2 ='Does the Ministry develop long-term, medium-term, short-term plans that are relevant to Federal, State, and Local government levels?';
        ministry14.q3 ='Are research and studies being conducted on public policy and other fields of national interest to develop the capabilities and management of the nation and the economy?';
        ministry14.q4 ='Is the Ministry able to foster collaboration and consensus among various government and non-government groups in support of policies and programmes?';
        ministry14.q5 ='Does the Ministry have active involvement in matters of regional economic co-operation, especially those involving the Economic community of West African States (ECOWAS), the African Common Market (ACM), and the United Nations Economic Commission for A';
        ministry14.save(flush: true)

        /*Minister of Trade, Investment & Industry*/
        def ministry15 = new MinistryDetails(firstName: "Okechukwu",lastName: "Enelamah",fullName: "Okechukwu Enelamah",ministryDesignation: "Minister of Trade, Investment & Industry", imageName: "MTI.jpg")
        ministry15.bio = 'Amina J. Mohammed is a key player in the post-2015 development process, serving as the Special Adviser to UN Secretary-General Ban Ki-Moon on post-2015 development planning. In this role, she acts as the link between the Secretary-General, his High Level Panel of Eminent Persons (HLP), and the General Assembly’s Open Working Group (OWG), among other stakeholders. <br/> ' +
                'Prior to this position, Ms. Mohammed served as Founder and CEO of the Center for Development Policy Solutions and as an Adjunct Professor for the Master’s in Development Practice program at Columbia University. Previously, she acted as the Senior Special Assistant to the President of Nigeria on the Millennium Development Goals after serving three presidents over a period of six years. In 2005, she was charged with the coordination of Nigeria’s debt relief funds toward the achievement of the MDGs. From 2002-2005, Ms. Mohammed coordinated the Task Force on Gender and Education for the UN Millennium Project. <br/>' +
                'Ms. Mohammed was appointed Hon Minister of the Environment by President Buhari when he swore in his new Cabinet on 11 November 2015. <br/>' +
                'Amina J. Mohammed is a key player in the post-2015 development process, serving as the Special Adviser to UN Secretary-General Ban Ki-Moon on post-2015 development planning. In this role, she acts as the link between the Secretary-General, his High Level Panel of Eminent Persons (HLP), and the General Assembly’s Open Working Group (OWG), among other stakeholders. <br/>' +
                'Prior to this position, Ms. Mohammed served as Founder and CEO of the Center for Development Policy Solutions and as an Adjunct Professor for the Master’s in Development Practice program at Columbia University. Previously, she acted as the Senior Special Assistant to the President of Nigeria on the Millennium Development Goals after serving three presidents over a period of six years. In 2005, she was charged with the coordination of Nigeria’s debt relief funds toward the achievement of the MDGs. From 2002-2005, Ms. Mohammed coordinated the Task Force on Gender and Education for the UN Millennium Project. <br/>' +
                'Ms. Mohammed was appointed Hon Minister of the Environment by President Buhari when he swore in his new Cabinet on 11 November 2015. <br/>' +
                'Amina J. Mohammed is a key player in the post-2015 development process, serving as the Special Adviser to UN Secretary-General Ban Ki-Moon on post-2015 development planning. In this role, she acts as the link between the Secretary-General, his High Level Panel of Eminent Persons (HLP), and the General Assembly’s Open Working Group (OWG), among other stakeholders. <br/>' +
                'Prior to this position, Ms. Mohammed served as Founder and CEO of the Center for Development Policy Solutions and as an Adjunct Professor for the Master’s in Development Practice program at Columbia University. Previously, she acted as the Senior Special Assistant to the President of Nigeria on the Millennium Development Goals after serving three presidents over a period of six years. In 2005, she was charged with the coordination of Nigeria’s debt relief funds toward the achievement of the MDGs. From 2002-2005, Ms. Mohammed coordinated the Task Force on Gender and Education for the UN Millennium Project. <br/>' +
                'Ms. Mohammed was appointed Hon Minister of the Environment by President Buhari when he swore in his new Cabinet on 11 N';
        ministry15.mandate = 'VISION <br/> ' +
                'To promote economic growth, create jobs and generate wealth <br/> ' +
                'MISSION <br/> ' +
                'To formulate and implement policies and programs to attract investment, boost industrialization, increase trade and exports and develop enterprises';
        ministry15.q1 ='Is the Ministry active in seeking domestic and foreign investment on trade industries?';
        ministry15.q2 ='Are there projects that aim to develop Micro, Small and Medium Enterprises (MSME) as engine for economic growth?';
        ministry15.q3 ='Is the Ministry executing projects that accelerate growth of industrial sector?';
        ministry15.q4 ='Is the execution of programmes such as the Nigerian Industrial Revolution Plan (NIRP), the National Enterprise Development Programme (NEDEP), and Trade Policy effective and able to produce desirable results?';
        ministry15.q5 ='Is the Ministry able to maximize benefits of international trade through relations with other countries?';
        ministry15.save(flush: true)

        /*Minister of Communication*/
        def ministry16 = new MinistryDetails(firstName: "Barr. Adebayo",lastName: "Shittu",fullName: "Barr. Adebayo Shittu",ministryDesignation: "Minister of Communication", imageName: "MC.jpg")
        ministry16.bio = 'Abdur-Raheem Adebayo Shittu (born 23 March 1953) is a minister from Oyo State, Nigeria. He became the youngest at age 26, to take the office of the Honourable Member of the Oyo State House of Assembly <br/> ' +
                'He gained admission into University of Ife, now Obafemi Awolowo University, Ile-Ife, Osun south west, Nigeria in the year 1974. At the end of 1978, he had obtained his first degree in Law from the same university. He ventured into politics at the age of 26yrs.In 1979,he became member of old Oyo House of Assembly. <br/>' +
                'In 1983, Barrister Shittu was elected as a member of Oyo state, House Assembly in the second republic. In 1983, the military government took over from the civilian government and he retired into legal practice and writing profession. He became a member of National Political conference in 2005.In 2011, He withdrew his gubernatorial ambition for the incumbent (2016) governor of Oyo State, senator Ajimobi Abiola. The administration of President Muhammadu Buhari appointed him as the substantive minister of communication in Nigeria.';
        ministry16.mandate = 'VISION <br/> ' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/> ' +
                'MISSION <br/> ' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        ministry16.q1 ='Does the Ministry roll out projects that aim to develop ICT infrastructure in the country?';
        ministry16.q2 ='Is the Ministry able to facilitate universal, ubiquitous and cost effective access to ICT?';
        ministry16.q3 ='Are there projects that utilize ICT to contribute to efficient government operations and transparency in governance?';
        ministry16.q4 ='Are research and studies being used as reference in conceptualizing projects for the ICT industry?';
        ministry16.q5 ='Are there projects that utilize ICT in fields such as digital content creation, domestic software application, and delivery of private and public services over the Internet?';
        ministry16.save(flush: true)

        /*Minister FCT*/
        def ministry17 = new MinistryDetails(firstName: "Muhammadu",lastName: "Bello",fullName: "Muhammadu Bello",ministryDesignation: "Minister FCT", imageName: "MFCT.jpg")
        ministry17.bio = 'Muhammadu Bello, who hails from Adamawa State. An old boy of the prestigious Barewa College, Zaria, a graduate of Ahmadu Bello University (ABU), Zaria, where he obtained a B.Sc in Management with bias for Banking and Finance in 1981 as well as an MBA in the same field. <br/> ' +
                'He has a very impressive career life which has spanned the finance industry, business and public service. He was in charge of Credit and Marketing department at the ICON Merchant Bank Plc and later a Director at Habib Bank Plc and several other top ranking firms. An experienced project manager, he was Managing Director of the Bakabure Industrial Complex, Yola. He also has been member of several sub-committees of the defunct Technical Committee on Privatization and Commercialization (TCPC). He was Chairman of National Hajj Commission of Nigeria [NAHCON] from 2007 until last May 2015. <br/>' +
                'He has been very active in the promotion of enterprise and commerce in Adamawa state, a passion which saw him play an active role as an official of the Adamawa Chamber of Commerce, Industry, Mines and Agriculture. <br/>' +
                'Mohammed Musa Bello was appointed Minister of Federal Capital Territory in 2015 by President Buhari.';
        ministry17.mandate = '&nbsp';
        ministry17.q1 ='Is the Ministry able to develop a master plan that elaborates on infrastructural and physical development of Federal Capital Territory?';
        ministry17.q2 ='Are the policies and programs of the Ministry at par with international standards?';
        ministry17.q3 ='Are the plans of the Ministry on developing Federal Capital Territory focused on inclusivity, functionality, design, and aesthetics?';
        ministry17.q4 ='Is the Ministry able to encourage citizen participation in developing infrastructure of Federal Capital Territory?';
        ministry17.q5 ='Is the Ministry able to collaborate with organizations involved in the planning and development of the infrastructure?';
        ministry17.save(flush: true)

        /*Minister of  Agriculture*/
        def ministry18 = new MinistryDetails(firstName: "Audu",lastName: "Ogbeh",fullName: "Audu Ogbeh",ministryDesignation: "Minister of  Agriculture", imageName: "MA.jpg")
        ministry18.bio = 'Audu Innocent Ogbeh was born 28 July 1947. Ogbeh was born on July 28, 1947, in Otukpo, Benue State, of Idoma background. He attended King’s College, Lagos (1967 – 1968), then studied at the Ahmadu Bello University, Zaria (1969 – 1972) and the University of Toulouse, France (1973 – 1974). He lectured at the Institute of Education, Ahmadu Bello University, Zaria (1972 – 1976) and headed the Department of Humanities, Murtala College of Arts, Science and Technology (1977 – 1979). <br/> ' +
                'In 1979 he ran for office in the Benue State House of Assembly on the Platform of the National Party of Nigeria (NPN), becoming deputy speaker of the house. In 1982 he was appointed Federal Minister of Communications, and later became Minister of Steel Development. His term of office ended in December 1983 when a military coup brought Major-General Muhammadu Buhari to power. <br/>' +
                'In 2001 he was appointed National Chairman of the People’s Democratic Party (PDP), replacing Chief Barnabas Gemade. <br/>' +
                'In December 2005, Ogbeh formally resigned from the PDP. As of 2009, he was chairman and managing director, Efugo Farms, Makurdi, and a member of Eisenhower Exchange Fellowships Incorporated, based in Philadelphia, United States of America. <br/>' +
                'He was appointed Minister of Agriculture in 2015 by President Buhari.';
        ministry18.mandate = 'Vision <br/>' +
                'Grow Nigeria’s agricultural sector <br/>' +
                'What we have started doing! <br/>' +
                '<ul><li>Execute an agricultural transformation agenda to support Mr. Presidents Transformation Agenda</li><li>Focus on agriculture as a business</li><li>Utilize the transformation of the agricultural sector to create jobs, create wealth and ensure food security</li><li>Focus on value chains where Nigeria has comparative advantage</li></ul> <br/>' +
                'Mission <br/>' +
                'Develop strategic partnerships to stimulate investments to drive a market-led agricultural transformation <br/>' +
                '<ul><li>State and Local Governments</li><li>Inter-ministerial collaboration</li><li>Private sector</li><li>Farmer groups and civil society</li><li>Sharp focus on youth and women</li></ul>';
        ministry18.q1 ='Is the Ministry able to develop an agricultural agenda reflective of pressing issues and concerns in the industry?';
        ministry18.q2 ='Does the Ministry have enough projects that aim to develop the state of agriculture to ensure food security in the country?';
        ministry18.q3 ='Is the Ministry placing its agricultural priorities in areas where Nigeria has a national advantage?';
        ministry18.q4 ='Is the Ministry active in seeking investments in the sector for its growth and development?';
        ministry18.q5 ='Is the Ministry able to foster collaboration, consensus, and partnerships with organizations that have the same goals with those of the Ministry?';
        ministry18.save(flush: true)

        /*Minister of Labour & Employment*/
        def ministry19 = new MinistryDetails(firstName: "Chris",lastName: "Ngige",fullName: "Chris Ngige",ministryDesignation: "Minister of Labour & Employment", imageName: "ML.jpg")
        ministry19.bio = 'Chris Ngige (born 8 August 1952) was governor of Anambra State[1] in Nigeria from 29 May 2003 to 17 March 2006 under the People Democratic Party (PDP). He is currently a member of the All Progressives Congress (APC).[2] He was elected Senator for Anambra Central Constituency in April 2011.  A medical doctor by profession, Ngige graduated from the University of Nigeria-Nsukka in 1979. He immediately went into the civil service, serving at the National Assembly and State House clinics at different times. He retired in 1998 as a Deputy Director in the Federal Ministry of Health';
        ministry19.mandate = 'Vision <br/>' +
                'To facilitate and promote peaceful, productive and harmonious industrial relations, safe and decent working environment and enhanced social security coverage for all Nigerians. <br/>' +
                'Mission <br/>' +
                'To create an enabling environment for growth and sustainable development through best practices in labour administration.';
        ministry19.q1 ='Is the Ministry able to develop employment policies and programmes that generate employment and able to actualize national action plan on employment?';
        ministry19.q2 ='Are there enough laws and policies covering labour protection, promotion of social justice, and education on labor rights?';
        ministry19.q3 ='Is the Ministry able to provide necessary provisions on social security coverage, welfare, and employee compensation?';
        ministry19.q4 ='Does the Ministry run awareness campaigns and projects focused on productivity consciousness, promotion of national competitiveness?';
        ministry19.q5 ='Are there projects that focus on skills development and certification, placement and empowerment of artisans, tradesmen and other individuals from other fields?';
        ministry19.save(flush: true)

        /*Minister of Transportation*/
        def ministry20 = new MinistryDetails(firstName: "Rotimi",lastName: "Amaechi",fullName: "Rotimi Amaechi",ministryDesignation: "Minister of Transportation", imageName: "MT.jpg")
        ministry20.bio = '(born 27 May 1965) is a Nigerian politician who served as the 5th Governor of Rivers State from 2007 to 2015. He was re-elected for a second term on 26 April 2011. Amaechi was a member of the People’s Democratic Party before defecting to the All Progressives Congress on 27 November 2013. He is now a serving Federal Minister of Transportation. <br/>' +
                'Amaechi was born in Ubima, Ikwerre Local Government Area of Rivers State to the family of late Elder Fidelis Amaechi and Mrs Mary Amaechi. He was raised in Diobu, a densely populated neighbourhood in Port Harcourt,[2][3] and had his early education at St Theresa’s Primary School from 1970 to 1976. He earned his West African School Certificate in 1982 after attending Government Secondary School Okolobiri. Chibuike received a Bachelor of Arts degree (Honours) in English Studies and Literature from the University of Port Harcourt in 1987, where he was the President of the National Union of Rivers State Students (NURSS). <br/>' +
                'He completed the mandatory National Youth Service in 1988. He thereafter joined the Services of Pamo Clinics and Hospitals Limited owned by Dr. Peter Odili, the former Governor of Rivers State where he worked until 1992. He is married to Judith Amaechi and they have three boys.';
        ministry20.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        ministry20.q1 ='&nbsp;';
        ministry20.q2 ='&nbsp;';
        ministry20.q3 ='&nbsp;';
        ministry20.q4 ='&nbsp;';
        ministry20.q5 ='&nbsp;';
        ministry20.save(flush: true)

        /*Minister of for Youth and Sports*/
        def ministry21 = new MinistryDetails(firstName: "Solomon",lastName: "Dalong",fullName: "Solomon Dalong",ministryDesignation: "Minister of for Youth and Sports", imageName: "MYS.jpg")
        ministry21.bio = 'Barrister Solomon Dalong was born on the 26th of September 1964. Dalong attended LEA Primary School Sabon Gida from 1971 to 1977. He then proceeded to Government College Keffi, now in Nassarawa State, for his secondary school education. <br/>' +
                'Dalong joined the Nigerian Prisons Service in the early eighties and in 1991 while still in the Prisons Service, Dalong enrolled to study Law at the Law Faculty of the University of Jos. He proceeded to the Nigerian Law School, Bwari, in Abuja, graduated in 2000 and was called to the Bar in 2001. <br/>' +
                'He worked as Personal Assistant to Chief Solomon Lar when Lar was appointed as Adviser Emeritus to President Olusegun Obasanjo, until 2004 when he took up an appointment with the Faculty of Law of the University of Jos as a lecturer. In 2005, he combined his job as a lecturer and study while pursuing a post graduate degree in Law, which he finished in 2007. <br/>' +
                'In the same 2007, Dalong was appointed the Chairman of Langtang South Local Government Area. He returned to the University of Jos in 2008 at the expiration of his tenure. <br/>' +
                'Dalong joined the Prisons Service as a Prison Assistant and rose to the rank of Assistant Inspector of Prisons. He was moved to the legal department of prisons where he served as Legal Officer II in the prisons headquarters before his retirement. <br/>'
        'He was appointed Minister for Youth and Sports in 2015 by President Muhammadu Buhari.';
        ministry21.mandate = 'Vision <br/>' +
                'To empower Nigerian youth to become self-reliant and socially responsible <br/>' +
                'Mission <br/>' +
                '&nbsp;';
        ministry21.q1 ='Ministry of Youth and Sports ? Is the Ministry able to create a master plan that highlights long-term and short-term plan for the youth?';
        ministry21.q2 ='Is the Ministry able to create policies that empower the youth and encourage active involvement in sports?';
        ministry21.q3 ='Does the Ministry run awareness campaigns highlighting the benefits of sport and teamwork in strengthening human potential?';
        ministry21.q4 ='Is the Ministry able to collaborate with government and non-government organizations focused on the youth?';
        ministry21.q5 ='Are there initiatives that mobilize the youth and encourage participation in national processes?';
        ministry21.save(flush: true)

        /*Minister of Water Resources*/
        def ministry22 = new MinistryDetails(firstName: "Suleiman",lastName: "Adamu",fullName: "Suleiman Adamu",ministryDesignation: "Minister of Water Resources", imageName: "MWR.jpg")
        ministry22.bio = 'Suleiman H. Adamu was born on the 19th of April 1963. He hails from Kazaure Local Government Area of Jigawa State. <br/>' +
                'He graduated from Ahmadu Bello University, Zaria, in 1984 with a Bachelor of Engineering (Second Class Upper Honours) in Civil Engineering; and also obtained a Master of Science degree in (Construction) Project Management from University of Reading, United Kingdom in 2004. <br/>' +
                'He started his career in the public sector at the Federal Capital Development Authority (FCDA) in 1985, where he supervised roads and bridges construction in Abuja Central Area Project; and at the Water Resources and Engineering Construction Agency (WRECA), Kano State, where he designed, supervised and managed water and dam projects. <br/>' +
                'He later co-founded Integrated Engineering Associates (IEA), a leading firm of civil/structural, electrical, mechanical and environmental engineering consultancy where he has been involved in the planning, design, supervision and management of several buildings and civil engineering projects in Nigeria covering a wide spectrum of engineering and infrastructural works like office/commercial structures, roads and water supply schemes. <br/>' +
                'Between 1995 and 2000, following his secondment by IEA as Principal Consultant under a partnership agreement with Afri-Projects Consortium, Management Consultants to the Petroleum (Special) Trust Fund, Adamu was actively involved in the planning and preparation of several national infrastructural projects in the health, education, transportation, agriculture, water resources and energy sectors. At implementation stage he served as Project Manager on several projects, notably under the PTF Urban/Semi-Urban, Regional and Rural Water Supply Programmes, National Farm Power Machinery Rehabilitation Programme and National Waterways Development Project (Dredging of River Niger). <br/>'
        'Adamu was the winner of the Nigeria Ports Authority prize for the Best Final Year Student in Civil Engineering, 1984. <br/>' +
                'He is a Registered Engineer and presently the National Vice President of Association of Consulting Engineering in Nigeria (ACEN). He will step in as its next President in January 2016. He is also a member of the American Society of Civil Engineers (ASCE) and Fellow, Nigerian Society of Engineers (NSE). <br/>' +
                'He served on the governing council of Council for the Regulation of Engineering in Nigeria, COREN (2006-2009) and is sitting on various committees of ACEN and NSE. <br/>' +
                'Adamu is a policy researcher and political administrator. He served as National Vice Chairman (North West), for the defunct Congress for Progressive Change (CPC), from 2010 – 2013; and had served in leading positions in several party committees and Presidential Campaign Councils of Buhari-Okadigbo (2003), Buhari-Ume-Ezeoke (2007), Buhari-Bakare (2011), and Buhari-Osinbajo (2015). He co-prepared The Buhari Programme 2003, The Buhari Programme 2007 and The Buhari Programme for Change 2011. <br/>' +
                'He is a member of Kazaure Emirate Council <br/>' +
                'He was appointed minister of water resources in 2015 by president Buhari.';
        ministry22.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        ministry22.q1 ='Is the Ministry able to develop programmes and policies towards ensuring adequate water supply that are reflective of needs in the agricultural, industrial, recreational, domestic sector?';
        ministry22.q2 ='Is the Ministry able to develop a Master Plan focused on the development of dams, irrigation and drainage, and water supply?';
        ministry22.q3 ='Does the Ministry regularly conduct studies and research for harnessing of potential of nation’s underground and surface water resources?';
        ministry22.q4 ='Are there regular review sessions on National Water Legislation?';
        ministry22.q5 ='Is the Ministry able to foster collaboration with national and international agencies on matters relating to water resources development?';
        ministry22.save(flush: true)

        /*Minister of Women Affairs*/
        def ministry23 = new MinistryDetails(firstName: "Aisha",lastName: "Alhassan",fullName: "Aisha Alhassan",ministryDesignation: "Minister of Women Affairs", imageName: "MWA.jpg")
        ministry23.bio = 'Aisha Jummai Al-Hassan is a Nigerian politician who is a Senator representing Taraba North constituency of Taraba State, Nigeria which she won under the platform of the People’s Democratic Party (PDP). She later decamped to the main opposition party All Progressive Congress (APC) and became the Gubernatorial Candidate ofTaraba State for the 2015 general elections. She was defeated in the election re-run held on 25th of April 2015, but on 7 November 2015 tribunal removes Taraba Governor, Darius Ishaku, declares Aisha Alhassan of the All Progressives Congress winner of April 11, 2015 poll. <br/>' +
                'Aisha Jummai Al-Hassan is a fulani. A lawyer by training, Aisha Jummai became the first female to be appointed Taraba State Attorney General and Commissioner of Justice. . The first woman to be appointed as Secretary FCT judicial council and later appointed the Chief Registrar of the High Court of the Federal Capital Territory, Abuja on 17 December 2003. After she retired from service she went into business';
        ministry23.mandate = 'Vision <br/>' +
                '\"To help build a Nigerian Society that guarantees equal access to social, economic and wealth creation opportunities to all, irrespective of gender, places premium on protection of the child, the aged and persons with disabilities; focuses attention of key operators in both private and public sectors on mainstreaming the concerns of these groups of people in national development process\". <br/>' +
                'Mission <br/>' +
                '\"To serve as the national vehicle to bring about speedy and healthy development of Nigerian Women, Children, the socially disadvantaged and physically challenged, and the main-streaming of their rights and privileges in national development process\".';
        ministry23.q1 ='Does the Ministry have projects that help women realize full potential in various fields of human endeavors?';
        ministry23.q2 ='Does the Ministry create awareness campaigns on policies and legislation concerning rights of women, children, and PWD in Nigeria?';
        ministry23.q3 ='Is the Ministry active in ensuring participation of women in national processes and in putting gender on issues of national importance?';
        ministry23.q4 ='Is the Ministry active in advocating passage and enforcement of laws protecting ministry’s target groups?';
        ministry23.q5 ='Is the Ministry able to coordinate social welfare activities and ensure elimination of practices that is detrimental to development of women and girls?';
        ministry23.save(flush: true)

        /*Abia*/
        def stateDetails1 = new StateDetails(stateName: "Abia", firstName: "Okezie", lastName: "Ikpeazu", fullName: "Okezie Ikpeazu", ministryDesignation: "Governor", imageName: "AB.jpg", partySymbol: "PDP.jpg")
        stateDetails1.bio = "Udom Gabriel Emmanuel, (born 11 July 1966), is the Governor of Akwa Ibom State of Nigeria, in office since 29 May 2015. He ran successfully for the office of Governor in the April 2015 elections on the platform of People’s Democratic Party (PDP) Emmanuel was elected Governor of Akwa Ibom State on 11 April 2015.[1] He was sworn-in on 29 May 2015.With his dakkada philosophy.Emmanuel rose from being a Sunday school leader at the Qua Iboe church to become a bank director";
        stateDetails1.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails1.save(flush: true)

        /*Adamawa*/
        def stateDetails2 = new StateDetails(stateName: "Adamawa", firstName: "Jibrilla", lastName: "Bindow", fullName: "Jibrilla Bindow", ministryDesignation: "Governor", imageName: "AD.jpg", partySymbol: "PDP.jpg")
        stateDetails2.bio = "Adamawa is a state in northeastern Nigeria, with its capital at Yola. It was formed in 1991 from part of Gongola State with four administrative divisions namely: Adamawa, Ganye, Mubi and Numan. It is also the home of the American University of Nigeria in Yola And Modibbo Adama University of Technology Yola. It is one of the thirty-six (36) States which constitute the Federal Republic of Nigeria.";
        stateDetails2.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails2.save(flush: true)

        /*Akwa Ibom*/
        def stateDetails3 = new StateDetails(stateName: "Akwa Ibom", firstName: "Udom", lastName: "Gabriel Emmanuel", fullName: "Udom Gabriel Emmanuel", ministryDesignation: "Governor", imageName: "AI.jpg", partySymbol: "PDP.jpg")
        stateDetails3.bio = "Udom Gabriel Emmanuel, (born 11 July 1966), is the Governor of Akwa Ibom State of Nigeria, in office since 29 May 2015. He ran successfully for the office of Governor in the April 2015 elections on the platform of People’s Democratic Party (PDP) Emmanuel was elected Governor of Akwa Ibom State on 11 April 2015.[1] He was sworn-in on 29 May 2015.With his dakkada philosophy.Emmanuel rose from being a Sunday school leader at the Qua Iboe church to become a bank director";
        stateDetails3.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails3.save(flush: true)

        /*Anambra State*/
        def stateDetails4 = new StateDetails(stateName: "Anambra State", firstName: "Willie", lastName: "Obiano", fullName: "Willie Obiano", ministryDesignation: "Governor", imageName: "AS.jpg", partySymbol: "APGA.jpg")
        stateDetails4.bio = "Chief Willie Obiano (born August 8, 1955) is a Nigerian banker, technocrat, politician and the fourth Democratic Governor of Anambra State.";
        stateDetails4.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails4.save(flush: true)

        /*Bauchi*/
        def stateDetails5 = new StateDetails(stateName: "Bauchi", firstName: "Mohammed Abdullahi", lastName: "Abubakar", fullName: "Mohammed Abdullahi Abubakar", ministryDesignation: "Governor", imageName: "BA.png", partySymbol: "APC.jpg")
        stateDetails5.bio = "Barrister Mohammad Abdullahi Abubakar (born 11 December 1956) is the governor of Bauchi State, Nigeria. He is a lawyer who began his career in the Civil Service where he rose through the ranks to become the Bauchi State Attorney General and Commissioner for Justice. He ran for public office as Governor of Bauchi State in 2015 under the platform of the All Progressives Congress, the state’s opposition party. He won the election, defeating the incumbent party’s candidate by over 370,000 votes.[1] He began his tenure as the governor of Bauchi on 29 May 2015, succeeding Isa Yuguda.";
        stateDetails5.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails5.save(flush: true)

        /*Bayelsa*/
        def stateDetails6 = new StateDetails(stateName: "Bayelsa", firstName: "Henry", lastName: "Dickson", fullName: "Henry Dickson", ministryDesignation: "Governor", imageName: "BY.jpg", partySymbol: "PDP.jpg")
        stateDetails6.bio = "Henry Seriake Dickson (born 28 January 1966) is a Nigerian politician. He assumed his role as the Governor of Bayelsa State in southern Nigeria on 14 February 2012. He was a member of the House of Representatives from 2007 until 2012.";
        stateDetails6.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails6.save(flush: true)

        /*Benue*/
        def stateDetails7 = new StateDetails(stateName: "Benue", firstName: "Samuel", lastName: "Ortom", fullName: "Samuel Ortom", ministryDesignation: "Governor", imageName: "BE.jpg", partySymbol: "APC.jpg")
        stateDetails7.bio = "Chief Dr. Samuel Ioraer Ortom (born 23 April 1961, Guma Local Government Area of Benue State, Nigeria) is a Nigerian industrialist, farmer, businessman, politician, philanthropist, administrator and employer. He was enrolled into the St. John’s Primary School, Gboko, in 1970 but moved to St. Catherine’s Primary School, Makurdi, in 1974, where he completed primary education in 1976. Chief Dr. Ortom was admitted into Idah Secondary Commercial College, Idah, in Kogi State in 1976. He did two years in the school before his father’s retirement in 1979 brought an abrupt end to his dream of completing formal secondary school education on account of inability to pay school fees. Shortly before this happened, he had given his life to Jesus Christ. However, instead of idling away at home to mourn his fate he girded his loins and got into the Gboko motor park as a tout.";
        stateDetails7.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails7.save(flush: true)

        /*Borno*/
        def stateDetails8 = new StateDetails(stateName: "Borno", firstName: "Kashim", lastName: "Shettima", fullName: "Kashim Shettima", ministryDesignation: "Governor", imageName: "BO.jpg", partySymbol: "APC.jpg")
        stateDetails8.bio = "Kashim Shettima (born 2 September 1966) is a Nigerian agricultural economist who was elected Governor of Borno State, Nigeria in the 26 April 2011 national elections, running on the All Nigeria People’s Party (ANPP) platform.[1] now part of the main opposition bloc, APC.";
        stateDetails8.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails8.save(flush: true)

        /*Cross River*/
        def stateDetails9 = new StateDetails(stateName: "Cross River", firstName: "Benedict", lastName: "Ayade", fullName: "Benedict Ayade", ministryDesignation: "Governor", imageName: "CR.jpg", partySymbol: "PDP.jpg")
        stateDetails9.bio = "Benedict Bengioushuye Ayade, (born 2nd March 1969), is the Governor of Cross River State of Nigeria. He was sworn-in on 29th May 2015. He ran successfully for the office of Governor in the April 2015 elections on the platform of People’s Democratic Party (PDP). Benedict Bengioushuye Ayade, (born 2nd March 1969), is the Governor of Cross River State of Nigeria. He was sworn-in on 29th May 2015. He ran successfully for the office of Governor in the April 2015 elections on the platform of People’s Democratic Party (PDP) Ayade was elected Governor of Cross River State on 11 April 2015. He was a member of the 7th Senate of the Federal Republic of Nigeria.";
        stateDetails9.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails9.save(flush: true)

        /*Delta*/
        def stateDetails10 = new StateDetails(stateName: "Delta", firstName: "Ifeanyi", lastName: "Okowa", fullName: "Ifeanyi Okowa", ministryDesignation: "Governor", imageName: "DE.jpg", partySymbol: "PDP.jpg")
        stateDetails10.bio = "Arthur Okowa Ifeanyi (born 8 July 1959) is the incumbent Governor of Delta State. He was inaugurated as Governor on 29 May 2015 after winning the state elections conducted in April 2015. Before his Governorship, he was elected Senator for Delta North, in Delta State, Nigeria, in the April 2011 national elections. He ran on the People’s Democratic Party (PDP) platform. He is an Ika from Owa-Alero in Delta State, Nigeria. He is also the first person from Anioma to clinch the governorship position of Delta State.";
        stateDetails10.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails10.save(flush: true)

        /*Ebonyi*/
        def stateDetails11 = new StateDetails(stateName: "Ebonyi", firstName: "Dave", lastName: "Umahi", fullName: "Dave Umahi", ministryDesignation: "Governor", imageName: "EB.png", partySymbol: "PDP.jpg")
        stateDetails11.bio = "David Nweze Umahi (known popularly as Dave Umahi, born January 1, 1964) is the current Governor Of Ebonyi State, Nigeria";
        stateDetails11.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails11.save(flush: true)

        /*Edo*/
        def stateDetails12 = new StateDetails(stateName: "Edo", firstName: "Adams", lastName: "Oshiomhole", fullName: "Adams Oshiomhole", ministryDesignation: "Governor", imageName: "ED.jpg", partySymbol: "PDP.jpg")
        stateDetails12.bio = "Adams Aliyu Oshiomhole (born 4 April 1952) is a former labor leader, turned politician who 2012 was elected for a second term as the Governor of Edo State in Nigeria on the platform of the Action Congress.His first term was won following his court appeal to the results of a massively rigged April 2007 election in which the candidate of the ruling People’s Democratic Party Oserheimen Osunbor had initially been declared the winner. He assumed office on 12 November 2008 after winning the appeal. <br/>" +
                'Oshiomhole was formerly president of the Nigeria Labour Congress (NLC), and was prominent as the leader of a campaign of industrial action against high oil prices in Nigeria.';
        stateDetails12.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails12.save(flush: true)

        /*Ekiti*/
        def stateDetails13 = new StateDetails(stateName: "Ekiti", firstName: "Ayo", lastName: "Fayose", fullName: "Ayo Fayose", ministryDesignation: "Governor", imageName: "EK.jpg", partySymbol: "PDP.jpg")
        stateDetails13.bio = 'Peter Ayodele Fayose (born 15 November 1960) is the current governor of Ekiti State in Nigeria . He was governor from 29 May 2003 to 16 October 2';
        stateDetails13.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails13.save(flush: true)

        /*Enugu*/
        def stateDetails14 = new StateDetails(stateName: "Enugu", firstName: "Ifeanyi", lastName: "Ugwuanyi", fullName: "Ifeanyi Ugwuanyi", ministryDesignation: "Governor", imageName: "EN.jpg", partySymbol: "PDP.jpg")
        stateDetails14.bio = 'Lawrence Ifeanyi Ugwuanyi (popularly known as “Gburugburu”) is a Nigerian politician who was elected the Executive Governor of Enugu State in April 2015 and was sworn in on 29 May 2015.[1][2] He was a member of the House of Representatives of the Federal Republic of Nigeriafor 12 years.[3] He is a People’s Democratic Party (PDP) member and represented Igboeze North/Udenu Federal Constinuency of Enugu State.[4] Ugwuanyi was elected governor of Enugu State under the PDP.';
        stateDetails14.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails14.save(flush: true)

        /*Gombe*/
        def stateDetails15 = new StateDetails(stateName: "Gombe", firstName: "Ibrahim Hassan", lastName: "Dankwambo", fullName: "Ibrahim Hassan Dankwambo", ministryDesignation: "Governor", imageName: "GO.jpg", partySymbol: "PDP.jpg")
        stateDetails15.bio = 'Ibrahim Hassan Dankwambo (born 4 April 1962) is a Nigerian who was elected Governor of Gombe State, Nigeria in the 26 April 2011 elections, running on the People’s Democratic Party (PDP) platform.';
        stateDetails15.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails15.save(flush: true)

        /*Imo*/
        def stateDetails16 = new StateDetails(stateName: "Imo", firstName: "Owelle Rochas", lastName: "Okorocha", fullName: "Owelle Rochas Okorocha", ministryDesignation: "Governor", imageName: "IM.jpg", partySymbol: "PDP.jpg")
        stateDetails16.bio = 'Owelle Rochas Anayo Okorocha (born 22 September 1962) is a Nigerian multi billionaire and politician from Imo State, Nigeria who won the 6 May 2011 gubernatorial election in Imo State and was reelected for his second term on April 11, 2015. In his first attempt, he ran on the All Progressives Grand Alliance (APGA) platform[1] and ran on the All Progressives Congress in his second shot. In both occasions, Rochas defeated his closest rival, incumbent governor Ikedi Ohakim and serving Deputy Speaker of the House of Representatives, Hon. Emeka Ihedioha, by a close margin of votes and had to go for reruns.';
        stateDetails16.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails16.save(flush: true)

        /*Jigawa*/
        def stateDetails17 = new StateDetails(stateName: "Jigawa", firstName: "Badaru", lastName: "Abubakar", fullName: "Badaru Abubakar", ministryDesignation: "Governor", imageName: "JI.jpg", partySymbol: "PDP.jpg")
        stateDetails17.bio = 'Alhaji Mohammed Badaru Abubakar (born on 29th September 1962) was elected governor of Jigawa State in April 2015.';
        stateDetails17.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails17.save(flush: true)

        /*Kaduna*/
        def stateDetails18 = new StateDetails(stateName: "Kaduna", firstName: "Nasir Ahmad", lastName: "el-Rufai", fullName: "Nasir Ahmad el-Rufai", ministryDesignation: "Governor", imageName: "KA.jpg", partySymbol: "PDP.jpg")
        stateDetails18.bio = 'Mallam Nasir Ahmad El-Rufai (born 16 February 1960)[1] is the incumbent Governor of Kaduna State and former Director General of The Bureau of Public Enterprises, the head privatisation agency in Nigeria and also the former[2] Minister of the[3] Federal Capital Territory, Abuja from 16 July 2003 to 29 May 2007. He is a member of All Progressives Congress (APC) and elected as the Executive Governor of Kaduna State at the just concluded elections in Nigeria.[4] His spell with the government began under the transition government of General Abdulsalami Abubakar, where he served as an adviser in the Transition government.[5] He was reportedly in self-exile during the tenure of President Umaru Yar’Adua. In November 2009, Nasir EL-Rufai stated plans to come back home to Nigeria despite the high level of risk he will be under.';
        stateDetails18.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails18.save(flush: true)

        /*Kano*/
        def stateDetails19 = new StateDetails(stateName: "Kano", firstName: "Abdullahi Umar", lastName: "Ganduje", fullName: "Abdullahi Umar Ganduje", ministryDesignation: "Governor", imageName: "KN.jpg", partySymbol: "PDP.jpg")
        stateDetails19.bio = 'He is the Governor of Kano State, having been elected on 13 April 2015, and sworn in on 29 May 2015. He is also a former two-term Deputy Governor of Kano State, serving from 1999 to 2003 and 2011 to 2015 under the administration of Rabiu Kwankwaso.';
        stateDetails19.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails19.save(flush: true)

        /*Katsina*/
        def stateDetails20 = new StateDetails(stateName: "Katsina", firstName: "Aminu Bello", lastName: "Masari", fullName: "Aminu Bello Masari", ministryDesignation: "Governor", imageName: "KT.jpg", partySymbol: "APC.jpg")
        stateDetails20.bio = 'Aminu Bello Masari (born 29 May 1950) is a Nigerian politician and current Governor of Katsina State. He was the speaker of the Nigerian House of Representatives between 2003 and 2007. Masari hails from Katsina State. <br/>' +
                'Masari ran unsuccessfully for the office of Katsina State Governor in the 2011 election under the platform of defunct Congress for Progressive Change. In December 2014 he emerged as the governorship candidate of the All Progressives Congress for the March 2015 elections. <br/>' +
                'He was declared winner of the 11 April 2015 Katsina State Governorship election, defeating his arch-rival Musa Nashuni; anointed candidate of incumbent Shema. <br/>' +
                'Aminu Bello Masari was sworn in as the Executive Governor of Kastina State on 29 May 2015. Governor. Masari is from the same State as the newly sworn in President of Nigeria Muhammadu Buhari.';
        stateDetails20.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails20.save(flush: true)

        /*Kebbi*/
        def stateDetails21 = new StateDetails(stateName: "Kebbi", firstName: "Abubakar Atiku", lastName: "Bagudu", fullName: "Abubakar Atiku Bagudu", ministryDesignation: "Governor", imageName: "KB.jpg", partySymbol: "APC.jpg")
        stateDetails21.bio = 'Abubakar Atiku Bagudu (born 26 December 1961) is a Nigerian politician who was elected Senator for the Kebbi Central constituency of Kebbi State, Nigeria in a by-election after Senator Adamu Aliero was appointed Minister of the Federal Capital Territory in December 2008. He ran successfully for reelection in the April 2011 national elections in the People’s Democratic Party (PDP) platform. He became the political party All Progressives Congress (APC) gubernatorial candidate in Nigeria’s 2015 general elections.';
        stateDetails21.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails21.save(flush: true)

        /*Kogi*/
        def stateDetails22 = new StateDetails(stateName: "Kogi", firstName: "Yahaya", lastName: "Bello", fullName: "Yahaya Bello", ministryDesignation: "Governor", imageName: "KO.jpg", partySymbol: "APC.jpg")
        stateDetails22.bio = 'Yahaya Bello (born June 18, 1975) is a politician, businessman and current Governor of Kogi State. He was constitutionally declared winner of the 2015 Kogi State gubernatorial election after he was chosen on the platform of the All Progressives Congress as the replacement for the late Abubakar Audu who originally won the election.';
        stateDetails22.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails22.save(flush: true)

        /*Kwara*/
        def stateDetails23 = new StateDetails(stateName: "Kwara", firstName: "Abdulfatah", lastName: "Ahmed", fullName: "Abdulfatah Ahmed", ministryDesignation: "Governor", imageName: "KW.jpg", partySymbol: "APC.jpg")
        stateDetails23.bio = 'Ahmed was born on 29 December 1963 in Share, Ifelodun Local Government Area of Kwara State. He attended Government College Funtua, Katsina State (1973–1978) and the school of Basic Studies of Kwara State College of Technology (now Kwara State Polytechnic), Ilorin (1978–1980). He went on to the University of Ilorin where he earned a BSc in Chemistry (1986) and a Master of Business Administration (MBA, 1992). <br/>' +
                'He was a lecturer in Organic Chemistry and later Acting Head of Department at Federal College of Arts and Science, Sokoto, in Sokoto State (1986–1990). He became an Assistant Manager at District Savings and Loans, Lagos (1991–1993). In 1993, he started work with Guaranty Trust Bank in the Credit and Marketing Unit. In 1998, he moved to Societe Generale Bank Nigeria as a Senior Manager/Group Head, Consumer Banking. Later, he became Public Sector Group for the North West region. Abdulfatah Ahmed is a Nigerian banker and public servant who was elected Governor of Kwara State in the 26 April 2011 elections, running on the All Progressives Congress (APC) platform.' ;
        stateDetails23.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails23.save(flush: true)

        /*Lagos*/
        def stateDetails24 = new StateDetails(stateName: "Lagos", firstName: "Akinwunmi", lastName: "Ambode", fullName: "Akinwunmi Ambode", ministryDesignation: "Governor", imageName: "LA.jpg", partySymbol: "APC.jpg")
        stateDetails24.bio = 'Akinwunmi Ambode was born on 14 June 1963 in Epe Lagos, into the family of Festus Akinwale Ambode and Christianah Oluleye Ambode. Akinwunmi Ambode is one of ten children of his father Festus Ambode.Akinwunmi Ambode is the Governor of Lagos State. He was a civil servant for 27 years and a financial consultant before running for public office as Governor of Lagos State in 2015. <br/>' +
                'Ambode ran for office of the Governor of Lagos State in April 2015 as a member of the All Progressives Congress, the state’s ruling party, he won the election, defeating the second-place candidate by more than 150,000 votes.[1] He began his tenure as the governor of Lagos on 29 May 2015, he succeeded Babatunde Fashola' ;
        stateDetails24.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails24.save(flush: true)

        /*Nasarawa*/
        def stateDetails25 = new StateDetails(stateName: "Nasarawa", firstName: "Umaru Tanko", lastName: "Al-Makura", fullName: "Umaru Tanko Al-Makura", ministryDesignation: "Governor", imageName: "NA.jpg", partySymbol: "APC.jpg")
        stateDetails25.bio = 'Al-makura was born around 1952 in Lafia, Nasarawa State. He attended Dunama Primary School, Lafia (1959–1966), Keffi Teacher’s College (1967–1971) and then Government Teachers College of Education, Uyo (1972–75). For a short period in 1975 he was an Assistant Producer at the Broadcasting Corporation of Northern Nigeria. He then went to Ahmadu Bello University, Zaria (1975–1978), graduating with a Bachelor of Education Degree. For his National Youth Service he was a teacher at the Government College, Markudi. <br/>' +
                'In 1978 he formed Almakura Nigeria Limited, importing and servicing agricultural and industrial machinery. Later he ventured into real estate and property development as owner and chairman of Ta’al Nigeria Limited, with properties in Abuja, Lagos, Kano and Washington DC, United States. He owns the Ta’al Lake Resort, Abuja and the Ta’al Conference Hotel, Lafia. <br/>' +
                'Umaru Tanko Al-Makura (August 1952) is a Nigerian businessman who was elected Governor of Nasarawa State. He was re-elected for a second term on April 11 2015.' ;
        stateDetails25.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails25.save(flush: true)

        /*Niger*/
        def stateDetails26 = new StateDetails(stateName: "Niger", firstName: "Abubakar Sani", lastName: "Bello", fullName: "Abubakar Sani Bello", ministryDesignation: "Governor", imageName: "NI.jpg", partySymbol: "APC.jpg")
        stateDetails26.bio = 'Born on 17 December 1967. He is the eldest child of the Nigerian Billionaire and former military Governor of old Kano state Col Sani Bello (RTD) . Abubakar Sani Bello attended ST. LOUIS PRIMARY SCHOOL KANO from 1974 – 1979 and later went to NIGERIAN MILITARY SCHOOL ZARIA 1980 – 1985 then was given admission into UNIVERSITY OF MAIDUGURI 1986 – 1991 where He obtained a B.Sc in Economics. Abubakar has worked in several parts of the country Starting from His NYSC days where He was posted to serve in Port Harcourt in the Marketing department of NICOTES Services as Supervisor. He is the current Governor of Niger State , Nigeria.' ;
        stateDetails26.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails26.save(flush: true)

        /*Ogun*/
        def stateDetails27 = new StateDetails(stateName: "Ogun", firstName: "Ibikunle Oyelaja", lastName: "Amosun", fullName: "Ibikunle Oyelaja Amosun", ministryDesignation: "Governor", imageName: "OG.jpg", partySymbol: "APC.jpg")
        stateDetails27.bio = 'Amosun was born on 25 January 1958 to a Muslim family. He attended primary school at African Church Primary school in Abeokuta (1965–1970), and then African Church Grammar school, Abeokuta (1971 – 1977). He then went to Ogun State Polytechnic, graduating with a Higher National Diploma (HND) in 1983. Amosun gained an Associate membership of the Institute of Chartered Accountants of Nigeria (ICAN) in 1990. He became a fellow of the Institute in 1996. He also became an Associate member of the Chartered Institute of Taxation of Nigeria (1998). <br/>' +
                'Amosun began his career as an audit trainee with Lanre Aremu & Co. (Chartered Accountants) 1984. Later he joined XtraEdge Consulting as a managing consultant. From 1990 he was Principal partner of Ibikunle Amosun & Co. (Chartered Accountants) in Lagos. Amosun went to the University of Westminster in London, United Kingdom, where he acquired a Master of Arts in International Finance in 2000. <br/>' +
                'Ibikunle Amosun was elected Senator for the Ogun Central district of Ogun State, Nigeria in April 2003. In April 2007 he made an unsuccessful bid to be elected governor of Ogun State. He ran for Governor again on 2011, and this time was elected on the Action Congress of Nigeria (ACN) platform. He ran for office for the 2nd Term under the All Progressives Congress in 2015 and won and was re-elected and sworn into office May 29, 2015.';
        stateDetails27.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails27.save(flush: true)

        /*Ondo*/
        def stateDetails28 = new StateDetails(stateName: "Ondo", firstName: "Olusegun", lastName: "Mimiko", fullName: "Olusegun Mimiko", ministryDesignation: "Governor", imageName: "ON.jpg", partySymbol: "PDP.jpg")
        stateDetails28.bio = 'Governor Olusegun Mimiko was said to have won the election on October 20, 2012 enabling him to continue in office for a second term making him the first Governor in Ondo State to win a second term election.Mimiko’s victory is now being contested by the candidate of the ACN – Rotimi Akeredolu, the candidate of the PDP – Olusola Alexander Oke and the candidate of the CPC – Olusoji Ehinlanwo <br/>' +
                'In October 2012, Mimiko stood as the Labour Party candidate for Nigeria’s Ondo State and polled the highest votes in the elections. The Ondo State governor, Olusegun Mimiko on Thursday October 2, 2014 officially decamped to the Peoples Democratic Party (PDP) from the Labour Party. He and his supporters were received back to the fold by the Vice President, Namadi Sambo, Senate President, David Mark, Deputy National Chairman, Uche Secondus and top party men at the Banquet Hall of the State House, Abuja. <br/>' +
                'On October 2nd he officially left the labour party for peoples democratic party.';
        stateDetails28.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails28.save(flush: true)

        /*Osun*/
        def stateDetails29 = new StateDetails(stateName: "Osun", firstName: "Rauf", lastName: "Aregbesola", fullName: "Rauf Aregbesola", ministryDesignation: "Governor", imageName: "OS.jpg", partySymbol: "APC.jpg")
        stateDetails29.bio = 'Ogbeni Rauf Aregbesola born 25 May 1957 is a Nigerian politician who ran for governor of The State of Osun in the 2007 elections. Although the People’s Democratic Party (PDP) candidate Olagunsoye Oyinlola was declared the winner, Aregbesola appealed the decision and on 26 November 2010 was declared the winner. <br/>' +
                'Aregbesola was formerly an activist. He was Lagos Commissioner for Works and Infrastructure when he ran for election in April 2007 on the Action Congress platform. In May 2008, Aregbesola called over 100 witnesses and tendered 168 exhibits in his petition before the Election Petitions Tribunal, alleging violence and ballot boxes stuffing in the election. In an October 2008 interview, he described Oyinlola as “a bully who came from a reactionary military arm”, stating that Oyinlola had done nothing for the people of Osun state. He also claimed that 12 people had died in the election violence. <br/>' +
                'In August 2009 the police arrested Aregbesola, apparently for involvement in the alleged forgery of a police report on the conduct of the elections. Later that month he sought bail so that he could perform the lesser Hajj in Saudi Arabia. In August 2010 the police summoned him to make a statement about a 14 June 2007 bomb explosion near the ministry of water resources. Aregbesola denied any involvement, stating that he was in Abuja at the time. <br/>' +
                'Justices of the Federal Appeal Court, Ibadan finally declared Aregbesola the winner of the 2007 election, ordering that he be sworn in as governor by noon on 27 November 2010. The Governor of Edo State, Comrade Adams Oshiomhole, offered his congratulations for the belated recognition of his election victory. Mr. Rauf Aregbesola, was on Saturday 12th of April 2014 endorsed as the governorship candidates of the All Progressives Congress in the states gubernatorial election slated for the 9th of August 2014. The emergence of Aregbesola was preceded by congresses held before the governor who had no contestants was endorsed as the flag bearer in the governorship election. The Nasir el-Rufai-led committee supervised the primary election in which Aregbesola was endorsed. While giving the governor the certificate of return, he said 269,631 members of the party voted Aregbesola for a second term out 355,390 members who registered in 332 wards across the state. He was to seek reelection for a second term on the platform of the All Progressives Congress on the 9th of August,2014, contesting against Sen. Iyiola Omisore of the People’s Democratic Party and Akinbade of the Labour Party. Having satisfied the requirement of the Law and scored the highest number of votes. He was declared the winner of the August 9th,2014 election and returned elected for another term of 4 years.';
        stateDetails29.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails29.save(flush: true)

        /*Oyo*/
        def stateDetails30 = new StateDetails(stateName: "Oyo", firstName: "Isiaka Abiola", lastName: "Ajimobi", fullName: "Isiaka Abiola Ajimobi", ministryDesignation: "Governor", imageName: "OY.jpg", partySymbol: "APC.jpg")
        stateDetails30.bio = 'Abiola Ajimobi was born on 16 December 1949 to the Ajimobi of Ibadan at Oja’ba, Ibadan. His was a political family. His grandfather was Sobaloju of Ibadan Land (a chief in the royal court of Ibadan). His uncle, Hon. N.A. Ajimobi was minister of works and transport in the Western Region. His father, Pa Ajimobi, was also an Honourable member of the House of Assembly in the Old Western region. He started his education at Saint Patricks Primary School, Oke-Padre in Ibadan. He completed his primary education at Ibadan City Council Primary School, Aperin. His secondary education was at Lagelu Grammar School.[5] As a high school student he was active in athletics, table tennis, and football including serving as the school’s games prefect. <br/>' +
                'His university education was in the United States of America. He studied Business Administration and Finance at the State University New York, in Buffalo, New York graduating with a Bachelor of Science degree. His MBA was in Operations Research and Marketing with a concentration in Finance at the Governor’s State University, Park Forest, Illinois. As a result of his academic credentials and excellent performance at the New York Insurance examinations, he was engaged in Buffalo, New York as a state certified underwriter, by Equitable Life Assurance Corporation, which was then the 2nd largest Insurance Company in America. He was formerly the Managing Director/Chief Executive Officer of the National Oil and Chemical Marketing Company a subsidiary of Shell Petroleum, Nigeria. He left the oil sector in 2002 after 26 years, and was elected in 2003 as a Senator of the Republic of Nigeria representing Oyo South Senatorial District on the platform of the Alliance for Democracy (AD). After one term in the senate, he contested in 2007 for the governorship of Oyo state under the banner of the All Nigeria People’s Party (ANPP), a bid which he lost. He recontested again in the April 2011 elections under the Action Congress of Nigeria (ACN) and was elected Governor of Oyo State in a closely contested vote.';
        stateDetails30.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails30.save(flush: true)

        /*Plateau*/
        def stateDetails31 = new StateDetails(stateName: "Plateau", firstName: "Simon", lastName: "Lalong", fullName: "Simon Lalong", ministryDesignation: "Governor", imageName: "PL.jpg", partySymbol: "APC.jpg")
        stateDetails31.bio = 'Simon Lalong (born 5 May 1963 in the Shendam lowland area of Plateau State) is a Nigerian lawyer and politician. After his elementary and secondary schools education in Shendam Local Government Area he proceeded to the School of Preliminary Studies (S.P.S) Keffi, passing out in 1986. He then continued to Ahmadu Bello University, Zaria, graduating in 1990 with a Bachelor’s Degree in Law. This was immediately followed by the Law School in Lagos, where he was also called to Bar. He later obtained a Master Degree in Law from the University of Jos, in 1996. Lalong’s professional career as an attorney lasted between 1992, the year following his graduation from law school, and 1998, the dawn of Nigeria’s new democracy. During this period he worked with a couple of law firms, one of which he co-owned. Between 1992 and 1994 he was he Deputy Scribe of the Nigerian Bar Association in Plateau State. After a political stint that lasted seven years he again returned to legal practice as the Principal Partner of Simon B Lalong and Co, until 2015. Simon Lalong temporarily discarded legal practice to join the political bandwagon in 1998. Under the People’s Democratic Party (PDP) he successfully contested the seat of the member of the Plateau State House of Assembly representing his native Shendam Constituency. In October 2000 he became the speaker of the assembly, occupying that position till the year 2006, following a political storm within the House. The seven years he served as the Speaker of that assembly made him the longest serving speaker of the House in the history of Plateau State. During that period he was two times (2001-2002) elected as the Chairman of the Conference of Speakers of the 36 states of Nigeria. In the year 2015, as the second tenure of the serving Governor of Plateau State, Jonah Jang, neared its end, Lalong joined the contest to succeed Jang. This time, he did so under the All Progressive Congress (APC) political platform. His chances seemed narrow at the beginning, but the capricious nature of politics tipped the balance eventually, favoring him by a slim margin. He was sworn in as the new Governor of Plateau State on May 29th, 2015.';
        stateDetails31.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails31.save(flush: true)

        /*Rivers*/
        def stateDetails32 = new StateDetails(stateName: "Rivers", firstName: "Ezenwo Nyesom", lastName: "Wike", fullName: "Ezenwo Nyesom Wike", ministryDesignation: "Governor", imageName: "RI.jpg", partySymbol: "PDP.jpg")
        stateDetails32.bio = 'Ezenwo Nyesom Wike (born 13 December 1967) is a Nigerian politician and lawyer who is the 6th and current Governor of Rivers State. He is an Ikwerre from Rumuepirikom in Obio-Akpor, Rivers State. He is a member of the People’s Democratic Party. <br/>' +
                'Wike was appointed Minister of State for Education on 14 July 2011. He was later appointed the Acting Minister of Education, after Mrs Riqqayatu was sacked but resigned before finishing his term to campaign for Governor of Rivers State. He was replaced by Viola Onwuliri.[1] In 2014, he won the Rivers State People’s Democratic Party primary and chose former Secretary to the State Government Ipalibo Banigo as his running mate for Deputy Governor. <br/>' +
                'He defeated Dakuku Peterside of the All Progressives Congress (APC) in the April 11 Gubernatorial Polls to emerge as Governor.';
        stateDetails32.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails32.save(flush: true)

        /*Sokoto*/
        def stateDetails33 = new StateDetails(stateName: "Sokoto", firstName: "Aminu Waziri", lastName: "Tambuwal", fullName: "Aminu Waziri Tambuwal", ministryDesignation: "Governor", imageName: "SO.jpg", partySymbol: "APC.jpg")
        stateDetails33.bio = 'Hon. Aminu was born on January 10, 1966 in Tambuwal Village in Sokoto State to Waziri Tambuwal. <br/>' +
                'He attended Tambuwal Primary School, Tambuwal, Sokoto State, where he obtained his First School Leaving Certificate in 1979; and Government Teachers’ College, Dogon-Daji, where he obtained the Teachers Grade 11 Certificate in 1984. He then proceeded to Usman Dan Fodio University, Sokoto, where he studied Law, graduating with an LLB (Hons) degree in 1991. He completed his one-year compulsory legal studies at the Nigerian Law School, Lagos, obtained his BL and was called to the Bar in 1992. <br/>' +
                'Besides studying for his law degree, he has also attended several courses abroad, among which are the following: Telecoms Regulatory Master Class–Bath UK, 2004; Lawmaking for the Communications Sectors –BMIT, Johannesburg, South Africa, 2004; Regulating a Competitive Industry-UK, Brussels, 2005; Tulane University – International Legislative Drafting, 2005; Stanford Graduate School of Business. Aminu Waziri Tambuwal (born January 10, 1966) is the Governor of Sokoto State. He was elected as Governor after the April 11th General Elections. He is also the former Speaker of the House of Representatives of Nigeria. He is an All Progressives Congress (APC) member and represented the Tambuwal/Kebbe Federal Constituency of Sokoto State.';
        stateDetails33.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails33.save(flush: true)

        /*Taraba*/
        def stateDetails34 = new StateDetails(stateName: "Taraba", firstName: "Mr. Darius", lastName: "Ishaku", fullName: "Mr. Darius Ishaku", ministryDesignation: "Governor", imageName: "TA.jpg", partySymbol: "PDP.jpg")
        stateDetails34.bio = 'He began his early Education at St Bartholomew’s Primary School, Wusasa, Zaria in 1961 and obtained his first School Leaving Certificate in 1967. <br/>' +
                'Darius Ishaku then proceeded for his Secondary Education at St. Paul’s College Kufena, Zaria where he obtained his West African Examination Certificate (WASC) in 1972. <br/>' +
                'He then went to the school of basic studies and passed out in 1974 after which he gained admission into the School of Architecture, Ahmadu Bello University Zaria where he graduated with a Bachelor’s Degree in Architecture in 1977. Darius did not stop there, but went further to obtain Masters Degrees in 1979. <br/>' +
                'He there fore develop interest in architecture and the study how to design buildings and other structures. <br/>' +
                'In 1974, he was admited into school of Architecture Ahmadu Bello University, Zaria, where he obtained his Bachelor’s of Science Degree in Architecture in 1977. Darius Ishaku was the past Minister of State for Niger Delta Affairs before he resigned in other to participate in the 2015 Gubernatorial polls. He however emerged as the Governor of Taraba State after a re-run election.';
        stateDetails34.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails34.save(flush: true)

        /*Yobe*/
        def stateDetails35 = new StateDetails(stateName: "Yobe", firstName: "Ibrahim", lastName: "Geidam", fullName: "Ibrahim Geidam", ministryDesignation: "Governor", imageName: "YO.jpg", partySymbol: "APC.jpg")
        stateDetails35.bio = 'Ibrahim Geidam was born on 15 September 1956 in Bukarti village, Yunusari local government area in the old Borno, now Yobe state. He attended the Borno Teachers’ College (BTC), Maiduguri from 1974 to 1979, where he obtained a Teachers’ Certificate. He attended Ahmadu Bello University, Zaria from 1981 and 1983, earning a Diploma in Accountancy. Later he returned to Ahmadu Bello University, earned a BSc in Accountancy Degree in 1990 and became a member of the Certified Public Accountants of Nigeria.';
        stateDetails35.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails35.save(flush: true)


        /*Zamfara*/
        def stateDetails36 = new StateDetails(stateName: "Zamfara", firstName: "Abdul-Aziz Yari", lastName: "Abubakar", fullName: "Abdul-Aziz Yari Abubakar", ministryDesignation: "Governor", imageName: "ZA.jpg", partySymbol: "APC.jpg")
        stateDetails36.bio = '&nbsp;';
        stateDetails36.mandate = 'Vision <br/>' +
                'Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications. <br/>' +
                'Mission <br/>' +
                'To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional.';
        stateDetails36.save(flush: true)

        def roleInstance = new Role(description:"Admin Role", type: "A", status: true)
        roleInstance.save(flush: true)

        def roleInstance1 = new Role(description:"User Role", type: "U", status: true)
        roleInstance1.save(flush: true)

        def userInstance = new User(userName: "admin",password:'admin', email:'admin@gmail.com', phone:'+919686968873', city:'Bnglr', state:'KA', firstName:'smartGauge', lastName:'admin', LGA:'admin LGA', dob:new Date().toString(), webSite:'wwww.smartgauge.com', roleInstance: Role.findByType("A"))
        userInstance.save(flush: true)

        def userInstance1 = new User(userName: "user",password:'user', email:'user@gmail.com', phone:'+919686968872', city:'Bnglr', state:'KA', firstName:'smartGauge', lastName:'user', LGA:'admin LGA', dob:new Date().toString(), webSite:'wwww.smartgauge.com', roleInstance: Role.findByType("U"))
        userInstance1.save(flush: true)
//
//        def commentsInstance = new Comments(user: userInstance, minister: ministry, comment:"Test Comment")
//        commentsInstance.save(flush: true)
//
//        def ratingInstance = new Rating(user: userInstance, ministry: ministry, rating: 4)
//        ratingInstance.save(flush: true)
    }
    def destroy = {
    }
}
