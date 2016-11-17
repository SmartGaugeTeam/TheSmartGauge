import thesmartguage.Comments
import thesmartguage.MinistryDetails
import thesmartguage.Rating
import thesmartguage.Role
import thesmartguage.StateDetails
import thesmartguage.User

class BootStrap {

    def init = { servletContext ->

//        def ministry = new MinistryDetails(firstName: "Dan",lastName: "Ali",fullName: "Dan Ali",ministryDesignation: "Ministry of Defence", imageName: "governor.jpg")
//        ministry.bio = "Mansur Dan Ali was born August 25 1959 is a retired Nigerian Army Brigadier General and current Minister of Defence of Nigeria appointed by President Muhammadu Buhari in November 2015.\n" +
//                "He attended Birnin Magaji Town Primary School (1966 -1972) for his elementary education and Government Secondary School, Shinkafi (1972-1977) for his secondary education. He received his Higher National Diploma (HND) in Photogrammetric and Surveying from Kaduna Polytechnic (1977-1982) and possesses a Master\'s Degrees in Public Policy and Administration (MPPA) from Bayero University Kano (2004-2005) and a Master\'s Degree in Security Studies from the Bangladesh University of Professionals (2009)\n" +
//                "Dan Ali was commissioned as a 2nd Lieutenant in the Nigerian Army in 1984 through the Short Service Commission at the Nigerian Defence Academy. Dan-Ali has served in different command and staff capacities, some of which include commanding the Nigerian contingent supporting the United Nations Africa Hybrid Mission in Sudan. Dan Ali was on the Directing Staff of the Armed Forces Command and Staff College, Jaji from 2003 -2005 and was Chief Instructor (CI) at the Nigerian Defence Academy in 2010. He was also Acting Director Military Training before getting posted to the Ministry of Defence\'s Logistics Department as Deputy Director. He retired from the Nigerian Army on August 30, 2013."
//        ministry.mandate = 'Vision\n' +
//                '\"In recognition of the challenges of the millennium, a Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications, capable of fulfilling its constitutional responsibilities and performing its international peace-keeping role proudly and efficiently.\"\n' +
//                'Mission\n' +
//                '\"To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional, mission-capable and mission-ready Armed Forces, for the defence of National territory maritime interest, airspace and the protection and defence of the constitution of the Federal Republic of Nigeria, and to contribute to peace-making and peace-keeping duties worldwide under sub-regional and global organizations of which Nigeria is a member.\"'
//        ministry.save(flush: true)

//        def stateDetails = new StateDetails(firstName: "StateFN", lastName: "stateLN", fullName: "stateFlN", ministryDesignation: "stateMD", bio: "stateBio", mandate: "stateMandate", imageName: "governor.jpg")
//        stateDetails.save(flush: true)

//        def roleInstance = new Role(description:"Admin Role", type: "A", status: true)
//        roleInstance.save(flush: true)

//        def userInstance = new User(userName: "admin",password:'admin', email:'admin@gmail.com', phone:'+919686968873', city:'Bnglr', state:'KA', firstName:'smartGauge', lastName:'admin', LGA:'admin LGA', dob:new Date().format( 'yyyyMMdd' ), webSite:'wwww.smartgauge.com', role: roleInstance)
//        userInstance.save(flush: true)

//        def commentsInstance = new Comments(user: userInstance, minister: ministry, comment:"Test Comment")
//        commentsInstance.save(flush: true)
//
//        def ratingInstance = new Rating(user: userInstance, ministry: ministry, rating: 4)
//        ratingInstance.save(flush: true)
    }
    def destroy = {
    }
}
