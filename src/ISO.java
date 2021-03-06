import java.util.List;

public enum ISO {

    ALB,
    AND,
    ARM,
    AUT,
    BEL,
    BGR,
    BIH,
    BLR,
    CHE,
    CYP,
    CZE,
    DEU,
    DNK,
    ESP,
    EST,
    FIN,
    FRA,
    FRO,
    GBR,
    GEO,
    GIB,
    GRC,
    HRV,
    HUN,
    IMN,
    IRL,
    ISL,
    ITA,
    JEY,
    OWID_KOS,
    LIE,
    LTU,
    LUX,
    LVA,
    MCO,
    MDA,
    MKD,
    MLT,
    MNE,
    NLD,
    NOR,
    POL,
    PRT,
    ROU,
    RUS,
    SMR,
    SRB,
    SVK,
    SVN,
    SWE,
    TUR,
    UKR,
    OWID_EUN,
    AFG,
    OWID_AFR,
    DZA,
    AGO,
    AIA,
    ATG,
    ARG,
    ABW,
    OWID_ASI,
    AUS,
    AZE,
    BHS,
    BHR,
    BGD,
    BRB,
    BLZ,
    BEN,
    BMU,
    BTN,
    BOL,
    BES,
    BWA,
    BRA,
    VGB,
    BRN,
    BFA,
    KHM,
    CMR,
    CAN,
    CPV,
    CYM,
    CAF,
    TCD,
    CHL,
    CHN,
    COL,
    COM,
    COG,
    COK,
    CRI,
    CIV,
    CUB,
    CUW,
    COD,
    DJI,
    DMA,
    DOM,
    ECU,
    EGY,
    SLV,
    OWID_ENG,
    GNQ,
    SWZ,
    ETH,
    OWID_EUR,
    FLK,
    FJI,
    PYF,
    GAB,
    GMB,
    GHA,
    GRL,
    GRD,
    GTM,
    GGY,
    GIN,
    GNB,
    GUY,
    HTI,
    OWID_HIC,
    HND,
    HKG,
    IND,
    IDN,
    IRN,
    IRQ,
    ISR,
    JAM,
    JPN,
    JOR,
    KAZ,
    KEN,
    KIR,
    KWT,
    KGZ,
    LAO,
    LBN,
    LSO,
    LBR,
    LBY,
    OWID_LIC,
    OWID_LMC,
    MAC,
    MDG,
    MWI,
    MYS,
    MDV,
    MLI,
    MRT,
    MUS,
    MEX,
    MNG,
    MSR,
    MAR,
    MOZ,
    MMR,
    NAM,
    NRU,
    NPL,
    NCL,
    NZL,
    NIC,
    NER,
    NGA,
    NIU,
    OWID_NAM,
    OWID_CYN,
    OWID_NIR,
    OWID_OCE,
    OMN,
    PAK,
    PSE,
    PAN,
    PNG,
    PRY,
    PER,
    PHL,
    PCN,
    QAT,
    RWA,
    SHN,
    KNA,
    LCA,
    VCT,
    WSM,
    STP,
    SAU,
    OWID_SCT,
    SEN,
    SYC,
    SLE,
    SGP,
    SXM,
    SLB,
    SOM,
    ZAF,
    OWID_SAM,
    KOR,
    SSD,
    LKA,
    SDN,
    SUR,
    SYR,
    TWN,
    TJK,
    TZA,
    THA,
    TLS,
    TGO,
    TKL,
    TON,
    TTO,
    TUN,
    TCA,
    TKM,
    TUV,
    UGA,
    ARE,
    USA,
    OWID_UMC,
    URY,
    UZB,
    VUT,
    VEN,
    VNM,
    OWID_WLS,
    WLF,
    OWID_WRL,
    YEM,
    ZMB,
    ZWE,
    BDI,
    ERI,
    MHL,
    FSM,
    PMW;

    public static String flag(ISO iso) {
        switch (iso) {
            case ALB: return "????????";
            case AND: return "????????";
            case ARM: return "????????";
            case AUT: return "????????";
            case BEL: return "????????";
            case BGR: return "????????";
            case BIH: return "????????";
            case BLR: return "????????";
            case CHE: return "????????";
            case CYP: return "????????";
            case CZE: return "????????";
            case DEU: return "????????";
            case DNK: return "????????";
            case ESP: return "????????";
            case EST: return "????????";
            case FIN: return "????????";
            case FRA: return "????????";
            case FRO: return "????????";
            case GBR: return "????????";
            case GEO: return "????????";
            case GIB: return "????????";
            case GRC: return "????????";
            case HRV: return "????????";
            case HUN: return "????????";
            case IMN: return "????????";
            case IRL: return "????????";
            case ISL: return "????????";
            case ITA: return "????????";
            case JEY: return "????????";
            case OWID_KOS: return "????????";
            case LIE: return "????????";
            case LTU: return "????????";
            case LUX: return "????????";
            case LVA: return "????????";
            case MCO: return "????????";
            case MDA: return "????????";
            case MKD: return "????????";
            case MLT: return "????????";
            case MNE: return "????????";
            case NLD: return "????????";
            case NOR: return "????????";
            case POL: return "????????";
            case PRT: return "????????";
            case ROU: return "????????";
            case RUS: return "????????";
            case SMR: return "????????";
            case SRB: return "????????";
            case SVK: return "????????";
            case SVN: return "????????";
            case SWE: return "????????";
            case TUR: return "????????";
            case UKR: return "????????";
            case OWID_EUN: return "????????";
            case AFG: return "????????";
            case OWID_AFR: return "????";
            case DZA: return "????????";
            case AGO: return "????????";
            case AIA: return "????????";
            case ATG: return "????????";
            case ARG: return "????????";
            case ABW: return "????????";
            case OWID_ASI: return "????";
            case AUS: return "????????";
            case AZE: return "????????";
            case BHS: return "????????";
            case BHR: return "????????";
            case BGD: return "????????";
            case BRB: return "????????";
            case BLZ: return "????????";
            case BEN: return "????????";
            case BMU: return "????????";
            case BTN: return "????????";
            case BOL: return "????????";
            case BES: return "????????";
            case BWA: return "????????";
            case BRA: return "????????";
            case VGB: return "????????";
            case BRN: return "????????";
            case BFA: return "????????";
            case KHM: return "????????";
            case CMR: return "????????";
            case CAN: return "????????";
            case CPV: return "????????";
            case CYM: return "????????";
            case CAF: return "????????";
            case TCD: return "????????";
            case CHL: return "????????";
            case CHN: return "????????";
            case COL: return "????????";
            case COM: return "????????";
            case COG: return "????????";
            case COK: return "????????";
            case CRI: return "????????";
            case CIV: return "????????";
            case CUB: return "????????";
            case CUW: return "????????";
            case COD: return "????????";
            case DJI: return "????????";
            case DMA: return "????????";
            case DOM: return "????????";
            case ECU: return "????????";
            case EGY: return "????????";
            case SLV: return "????????";
            case OWID_ENG: return "????????????????????????????";
            case GNQ: return "????????";
            case SWZ: return "????????";
            case ETH: return "????????";
            case OWID_EUR: return "????";
            case FLK: return "????????";
            case FJI: return "????????";
            case PYF: return "????????";
            case GAB: return "????????";
            case GMB: return "????????";
            case GHA: return "????????";
            case GRL: return "????????";
            case GRD: return "????????";
            case GTM: return "????????";
            case GGY: return "????????";
            case GIN: return "????????";
            case GNB: return "????????";
            case GUY: return "????????";
            case HTI: return "????????";
            case OWID_HIC: return "????";
            case HND: return "????????";
            case HKG: return "????????";
            case IND: return "????????";
            case IDN: return "????????";
            case IRN: return "????????";
            case IRQ: return "????????";
            case ISR: return "????????";
            case JAM: return "????????";
            case JPN: return "????????";
            case JOR: return "????????";
            case KAZ: return "????????";
            case KEN: return "????????";
            case KIR: return "????????";
            case KWT: return "????????";
            case KGZ: return "????????";
            case LAO: return "????????";
            case LBN: return "????????";
            case LSO: return "????????";
            case LBR: return "????????";
            case LBY: return "????????";
            case OWID_LIC: return "????";
            case OWID_LMC: return "????";
            case MAC: return "????????";
            case MDG: return "????????";
            case MWI: return "????????";
            case MYS: return "????????";
            case MDV: return "????????";
            case MLI: return "????????";
            case MRT: return "????????";
            case MUS: return "????????";
            case MEX: return "????????";
            case MNG: return "????????";
            case MSR: return "????????";
            case MAR: return "????????";
            case MOZ: return "????????";
            case MMR: return "????????";
            case NAM: return "????????";
            case NRU: return "????????";
            case NPL: return "????????";
            case NCL: return "????????";
            case NZL: return "????????";
            case NIC: return "????????";
            case NER: return "????????";
            case NGA: return "????????";
            case NIU: return "????????";
            case OWID_NAM: return "????";
            case OWID_CYN: return "????????";
            case OWID_NIR: return "????????";
            case OWID_OCE: return "????";
            case OMN: return "????????";
            case PAK: return "????????";
            case PSE: return "????????";
            case PAN: return "????????";
            case PNG: return "????????";
            case PRY: return "????????";
            case PER: return "????????";
            case PHL: return "????????";
            case PCN: return "????????";
            case QAT: return "????????";
            case RWA: return "????????";
            case SHN: return "????????";
            case KNA: return "????????";
            case LCA: return "????????";
            case VCT: return "????????";
            case WSM: return "????????";
            case STP: return "????????";
            case SAU: return "????????";
            case OWID_SCT: return "????????????????????????????";
            case SEN: return "????????";
            case SYC: return "????????";
            case SLE: return "????????";
            case SGP: return "????????";
            case SXM: return "????????";
            case SLB: return "????????";
            case SOM: return "????????";
            case ZAF: return "????????";
            case OWID_SAM: return "????";
            case KOR: return "????????";
            case SSD: return "????????";
            case LKA: return "????????";
            case SDN: return "????????";
            case SUR: return "????????";
            case SYR: return "????????";
            case TWN: return "????????";
            case TJK: return "????????";
            case TZA: return "????????";
            case THA: return "????????";
            case TLS: return "????????";
            case TGO: return "????????";
            case TKL: return "????????";
            case TON: return "????????";
            case TTO: return "????????";
            case TUN: return "????????";
            case TCA: return "????????";
            case TKM: return "????????";
            case TUV: return "????????";
            case UGA: return "????????";
            case ARE: return "????????";
            case USA: return "????????";
            case OWID_UMC: return "????";
            case URY: return "????????";
            case UZB: return "????????";
            case VUT: return "????????";
            case VEN: return "????????";
            case VNM: return "????????";
            case OWID_WLS: return "????????????????????????????";
            case WLF: return "????????";
            case OWID_WRL: return "????";
            case YEM: return "????????";
            case ZMB: return "????????";
            case ZWE: return "????????";
            case BDI: return "????????";
            case ERI: return "????????";
            case MHL: return "????????";
            case FSM: return "????????";
            case PMW: return "????????";

            default: return "????";
        }
    }

    public static String textToCountry(String iso) {
        switch (iso) {
            case "ALB": return "Albanie";
            case "AND": return "Andorre";
            case "ARM": return "Arm??nie";
            case "AUT": return "Autriche";
            case "BEL": return "Belgique";
            case "BGR": return "Bulgarie";
            case "BIH": return "Bosnie-Herz??govine";
            case "BLR": return "Bi??lorussie";
            case "CHE": return "Suisse";
            case "CYP": return "Chypre";
            case "CZE": return "Tch??quie";
            case "DEU": return "Allemagne";
            case "DNK": return "Danemark";
            case "ESP": return "Espagne";
            case "EST": return "Estonie";
            case "FIN": return "Finlande";
            case "FRA": return "France";
            case "FRO": return "??les F??ro??";
            case "GBR": return "Royaume-Uni";
            case "GEO": return "G??orgie";
            case "GIB": return "Gibraltar";
            case "GRC": return "Gr??ce";
            case "HRV": return "Croatie";
            case "HUN": return "Hongrie";
            case "IMN": return "??le de Man";
            case "IRL": return "Irlande";
            case "ISL": return "Islande";
            case "ITA": return "Italie";
            case "JEY": return "Jersey";
            case "OWID_KOS": return "Kosovo";
            case "LIE": return "Liechtenstein";
            case "LTU": return "Lituanie";
            case "LUX": return "Luxembourg";
            case "LVA": return "Lettonie";
            case "MCO": return "Monaco";
            case "MDA": return "Moldavie";
            case "MKD": return "Mac??doine du Nord";
            case "MLT": return "Malte";
            case "MNE": return "Mont??n??gro";
            case "NLD": return "Pays-Bas";
            case "NOR": return "Norv??ge";
            case "POL": return "Pologne";
            case "PRT": return "Portugal";
            case "ROU": return "Roumanie";
            case "RUS": return "Russie";
            case "SMR": return "Saint-Marin";
            case "SRB": return "Serbie";
            case "SVK": return "Slovaquie";
            case "SVN": return "Slov??nie";
            case "SWE": return "Su??de";
            case "TUR": return "Turquie";
            case "UKR": return "Ukraine";
            case "OWID_EUN": return "Union Europ??enne";
            case "AFG": return "Afghanistan";
            case "OWID_AFR": return "Afrique";
            case "DZA":return "Alg??rie";
            case "AGO": return "Angola";
            case "AIA": return "Anguilla";
            case "ATG": return "Antigua-et-Barbuda";
            case "ARG": return "Argentine";
            case "ABW": return "Aruba";
            case "OWID_ASI": return "Asie";
            case "AUS": return "Australie";
            case "AZE": return "Azerba??djan";
            case "BHS": return "Bahamas";
            case "BHR": return "Bahre??n";
            case "BGD": return "Bangladesh";
            case "BRB": return "Barbade";
            case "BLZ": return "Belize";
            case "BEN": return "B??nin";
            case "BMU": return "Bermudes";
            case "BTN": return "Bhoutan";
            case "BOL": return "Bolivie";
            case "BES": return "Bonaire, Saint-Eustache et Saba";
            case "BWA": return "Botswana";
            case "BRA": return "Br??sil";
            case "VGB": return "??les Vierges britanniques";
            case "BRN": return "Brunei";
            case "BFA": return "Burkina Faso";
            case "KHM": return "Cambodge";
            case "CMR": return "Cameroun";
            case "CAN": return "Canada";
            case "CPV": return "Cap-Vert";
            case "CYM": return "??les Ca??mans";
            case "CAF": return "R??publique centrafricaine";
            case "TCD": return "Tchad";
            case "CHL": return "Chili";
            case "CHN": return "Chine";
            case "COL": return "Colombie";
            case "COM": return "Comores";
            case "COG": return "R??publique du Congo";
            case "COK": return "??les Cook";
            case "CRI": return "Costa Rica";
            case "CIV": return "C??te d'Ivoire";
            case "CUB": return "Cuba";
            case "CUW": return "Cura??ao";
            case "COD": return "R??publique d??mocratique du Congo";
            case "DJI": return "Djibouti";
            case "DMA": return "Dominique";
            case "DOM": return "R??publique dominicaine";
            case "ECU": return "??quateur";
            case "EGY": return "??gypte";
            case "SLV": return "Salvador";
            case "OWID_ENG": return "Angleterre";
            case "GNQ": return "Guin??e ??quatoriale";
            case "SWZ": return "Eswatini";
            case "ETH": return "??thiopie";
            case "OWID_EUR": return "Europe";
            case "FLK": return "??les Malouines";
            case "FJI": return "Fidji";
            case "PYF": return "Polyn??sie Fran??aise";
            case "GAB": return "Gabon";
            case "GMB": return "Gambie";
            case "GHA": return "Ghana";
            case "GRL": return "Groenland";
            case "GRD": return "Grenade";
            case "GTM": return "Guatemala";
            case "GGY": return "Guernesey";
            case "GIN": return "Guin??e";
            case "GNB": return "Guin??e-Bissau";
            case "GUY": return "Guyana";
            case "HTI": return "Ha??ti";
            case "OWID_HIC": return "Pays ?? revenu ??lev??";
            case "HND": return "Honduras";
            case "HKG": return "Hong Kong";
            case "IND": return "Inde";
            case "IDN": return "Indon??sie";
            case "IRN": return "Iran";
            case "IRQ": return "Irak";
            case "ISR": return "Isra??l";
            case "JAM": return "Jama??que";
            case "JPN": return "Japon";
            case "JOR": return "Jordanie";
            case "KAZ": return "Kazakhstan";
            case "KEN": return "Kenya";
            case "KIR": return "Kiribati";
            case "KWT": return "Kowe??t";
            case "KGZ": return "Kirghizistan";
            case "LAO": return "Laos";
            case "LBN": return "Liban";
            case "LSO": return "Lesotho";
            case "LBR": return "Lib??ria";
            case "LBY": return "Libye";
            case "OWID_LIC": return "Pays ?? faible revenu";
            case "OWID_LMC": return "Pays ?? revenu interm??diaire inf??rieur";
            case "MAC": return "Macao";
            case "MDG": return "Madagascar";
            case "MWI": return "Malawi";
            case "MYS": return "Malaisie";
            case "MDV": return "Maldives";
            case "MLI": return "Mali";
            case "MRT": return "Mauritanie";
            case "MUS": return "Maurice";
            case "MEX": return "Mexique";
            case "MNG": return "Mongolie";
            case "MSR": return "Montserrat";
            case "MAR": return "Maroc";
            case "MOZ": return "Mozambique";
            case "MMR": return "Birmanie";
            case "NAM": return "Namibie";
            case "NRU": return "Nauru";
            case "NPL": return "N??pal";
            case "NCL": return "Nouvelle-Cal??donie";
            case "NZL": return "Nouvelle-Z??lande";
            case "NIC": return "Nicaragua";
            case "NER": return "Niger";
            case "NGA": return "Nigeria";
            case "NIU": return "Niu??";
            case "OWID_NAM": return "Am??rique du Nord";
            case "OWID_CYN": return "Chypre du Nord";
            case "OWID_NIR": return "Irlande du Nord";
            case "OWID_OCE": return "Oc??anie";
            case "OMN": return "Oman";
            case "PAK": return "Pakistan";
            case "PSE": return "Palestine";
            case "PAN": return "Panama";
            case "PNG": return "Papouasie-Nouvelle-Guin??e";
            case "PRY": return "Paraguay";
            case "PER": return "P??rou";
            case "PHL": return "Philippines";
            case "PCN": return "??les Pitcairn";
            case "QAT": return "Qatar";
            case "RWA": return "Rwanda";
            case "SHN": return "Sainte-H??l??ne";
            case "KNA": return "Saint-Christophe-et-Ni??v??s";
            case "LCA": return "Sainte-Lucie";
            case "VCT": return "Saint-Vincent-et-les-Grenadines";
            case "WSM": return "Samoa";
            case "STP": return "Sao Tom??-et-Principe";
            case "SAU": return "Arabie saoudite";
            case "OWID_SCT": return "??cosse";
            case "SEN": return "S??n??gal";
            case "SYC": return "Seychelles";
            case "SLE": return "Sierra Leone";
            case "SGP": return "Singapour";
            case "SXM": return "Saint-Martin (c??t?? n??erlandais)";
            case "SLB": return "??les Salomon";
            case "SOM": return "Somalie";
            case "ZAF": return "Afrique du Sud";
            case "OWID_SAM": return "Am??rique du Sud";
            case "KOR": return "Cor??e du Sud";
            case "SSD": return "Soudan du Sud";
            case "LKA": return "Sri Lanka";
            case "SDN": return "Soudan";
            case "SUR": return "Suriname";
            case "SYR": return "Syrie";
            case "TWN": return "Ta??wan";
            case "TJK": return "Tadjikistan";
            case "TZA": return "Tanzanie";
            case "THA": return "Tha??lande";
            case "TLS": return "Timor-Leste";
            case "TGO": return "Togo";
            case "TKL": return "Tokelau";
            case "TON": return "Tonga";
            case "TTO": return "Trinit??-et-Tobago";
            case "TUN": return "Tunisie";
            case "TCA": return "??les Turques et Ca??ques";
            case "TKM": return "Turkm??nistan";
            case "TUV": return "Tuvalu";
            case "UGA": return "Ouganda";
            case "ARE": return "??mirats arabes unis";
            case "USA": return "??tats-Unis";
            case "OWID_UMC": return "Pays ?? revenu interm??diaire sup??rieur";
            case "URY": return "Uruguay";
            case "UZB": return "Ouzb??kistan";
            case "VUT": return "Vanuatu";
            case "VEN": return "Venezuela";
            case "VNM": return "Vietnam";
            case "OWID_WLS": return "Pays de Galles";
            case "WLF": return "Wallis et Futuna";
            case "OWID_WRL": return "Monde";
            case "YEM": return "Y??men";
            case "ZMB": return "Zambie";
            case "ZWE": return "Zimbabwe";
            case "BDI": return "Burundi";
            case "ERI": return "??rythr??e";
            case "MHL": return "??les Marshall";
            case "FSM": return "Micron??sie";
            case "PMW": return "Palaos";

            default: return "Pays";
        }
    }

    public static boolean europe(List<String[]> country) {
        return country.get(0)[0].equals(ALB.name()) ||
                country.get(0)[0].equals(AND.name()) ||
                country.get(0)[0].equals(AUT.name()) ||
                country.get(0)[0].equals(BEL.name()) ||
                country.get(0)[0].equals(BGR.name()) ||
                country.get(0)[0].equals(BIH.name()) ||
                country.get(0)[0].equals(BLR.name()) ||
                country.get(0)[0].equals(CHE.name()) ||
                country.get(0)[0].equals(CYP.name()) ||
                country.get(0)[0].equals(CZE.name()) ||
                country.get(0)[0].equals(DEU.name()) ||
                country.get(0)[0].equals(DNK.name()) ||
                country.get(0)[0].equals(ESP.name()) ||
                country.get(0)[0].equals(EST.name()) ||
                country.get(0)[0].equals(FIN.name()) ||
                country.get(0)[0].equals(FRA.name()) ||
                country.get(0)[0].equals(GBR.name()) ||
                country.get(0)[0].equals(GRC.name()) ||
                country.get(0)[0].equals(HRV.name()) ||
                country.get(0)[0].equals(HUN.name()) ||
                country.get(0)[0].equals(IRL.name()) ||
                country.get(0)[0].equals(ISL.name()) ||
                country.get(0)[0].equals(ITA.name()) ||
                country.get(0)[0].equals(OWID_KOS.name()) ||
                country.get(0)[0].equals(LIE.name()) ||
                country.get(0)[0].equals(LTU.name()) ||
                country.get(0)[0].equals(LUX.name()) ||
                country.get(0)[0].equals(LVA.name()) ||
                country.get(0)[0].equals(MCO.name()) ||
                country.get(0)[0].equals(MDA.name()) ||
                country.get(0)[0].equals(MKD.name()) ||
                country.get(0)[0].equals(MLT.name()) ||
                country.get(0)[0].equals(MNE.name()) ||
                country.get(0)[0].equals(NLD.name()) ||
                country.get(0)[0].equals(NOR.name()) ||
                country.get(0)[0].equals(POL.name()) ||
                country.get(0)[0].equals(PRT.name()) ||
                country.get(0)[0].equals(ROU.name()) ||
                country.get(0)[0].equals(RUS.name()) ||
                country.get(0)[0].equals(SMR.name()) ||
                country.get(0)[0].equals(SRB.name()) ||
                country.get(0)[0].equals(SVK.name()) ||
                country.get(0)[0].equals(SVN.name()) ||
                country.get(0)[0].equals(SWE.name()) ||
                country.get(0)[0].equals(TUR.name()) ||
                country.get(0)[0].equals(UKR.name()) ||
                country.get(0)[0].equals(OWID_EUR.name());
    }

    public static boolean ue(List<String[]> country) {
        return country.get(0)[0].equals(AUT.name()) ||
                country.get(0)[0].equals(BEL.name()) ||
                country.get(0)[0].equals(BGR.name()) ||
                country.get(0)[0].equals(CYP.name()) ||
                country.get(0)[0].equals(CZE.name()) ||
                country.get(0)[0].equals(DEU.name()) ||
                country.get(0)[0].equals(DNK.name()) ||
                country.get(0)[0].equals(ESP.name()) ||
                country.get(0)[0].equals(EST.name()) ||
                country.get(0)[0].equals(FIN.name()) ||
                country.get(0)[0].equals(FRA.name()) ||
                country.get(0)[0].equals(GRC.name()) ||
                country.get(0)[0].equals(HRV.name()) ||
                country.get(0)[0].equals(HUN.name()) ||
                country.get(0)[0].equals(IRL.name()) ||
                country.get(0)[0].equals(ITA.name()) ||
                country.get(0)[0].equals(LTU.name()) ||
                country.get(0)[0].equals(LUX.name()) ||
                country.get(0)[0].equals(LVA.name()) ||
                country.get(0)[0].equals(MLT.name()) ||
                country.get(0)[0].equals(NLD.name()) ||
                country.get(0)[0].equals(POL.name()) ||
                country.get(0)[0].equals(PRT.name()) ||
                country.get(0)[0].equals(ROU.name()) ||
                country.get(0)[0].equals(SVK.name()) ||
                country.get(0)[0].equals(SVN.name()) ||
                country.get(0)[0].equals(SWE.name()) ||
                country.get(0)[0].equals(OWID_EUN.name());
    }

    public static boolean amerique(List<String[]> country) {
        return country.get(0)[0].equals(ATG.name()) ||
                country.get(0)[0].equals(ARG.name()) ||
                country.get(0)[0].equals(BHS.name()) ||
                country.get(0)[0].equals(BRB.name()) ||
                country.get(0)[0].equals(BLZ.name()) ||
                country.get(0)[0].equals(BOL.name()) ||
                country.get(0)[0].equals(BRA.name()) ||
                country.get(0)[0].equals(CAN.name()) ||
                country.get(0)[0].equals(CHL.name()) ||
                country.get(0)[0].equals(COL.name()) ||
                country.get(0)[0].equals(CRI.name()) ||
                country.get(0)[0].equals(CUB.name()) ||
                country.get(0)[0].equals(DOM.name()) ||
                country.get(0)[0].equals(DMA.name()) ||
                country.get(0)[0].equals(ECU.name()) ||
                country.get(0)[0].equals(USA.name()) ||
                country.get(0)[0].equals(GRD.name()) ||
                country.get(0)[0].equals(GTM.name()) ||
                country.get(0)[0].equals(GUY.name()) ||
                country.get(0)[0].equals(HTI.name()) ||
                country.get(0)[0].equals(HND.name()) ||
                country.get(0)[0].equals(JAM.name()) ||
                country.get(0)[0].equals(MEX.name()) ||
                country.get(0)[0].equals(NIC.name()) ||
                country.get(0)[0].equals(PAN.name()) ||
                country.get(0)[0].equals(PRY.name()) ||
                country.get(0)[0].equals(PER.name()) ||
                country.get(0)[0].equals(KNA.name()) ||
                country.get(0)[0].equals(LCA.name()) ||
                country.get(0)[0].equals(VCT.name()) ||
                country.get(0)[0].equals(SLV.name()) ||
                country.get(0)[0].equals(SUR.name()) ||
                country.get(0)[0].equals(TTO.name()) ||
                country.get(0)[0].equals(URY.name()) ||
                country.get(0)[0].equals(VEN.name()) ||
                country.get(0)[0].equals(ABW.name()) ||
                country.get(0)[0].equals(BES.name()) ||
                country.get(0)[0].equals(CUW.name()) ||
                country.get(0)[0].equals(GRL.name()) ||
                country.get(0)[0].equals(SXM.name()) ||
                country.get(0)[0].equals(OWID_NAM.name()) ||
                country.get(0)[0].equals(OWID_SAM.name());
    }

    public static boolean ameriqueDuNord(List<String[]> country) {
        return country.get(0)[0].equals(CAN.name()) ||
                country.get(0)[0].equals(GRL.name()) ||
                country.get(0)[0].equals(MEX.name()) ||
                country.get(0)[0].equals(USA.name()) ||
                country.get(0)[0].equals(OWID_NAM.name());
    }

    public static boolean ameriqueCentrale(List<String[]> country) {
        return country.get(0)[0].equals(GTM.name()) ||
                country.get(0)[0].equals(BLZ.name()) ||
                country.get(0)[0].equals(HND.name()) ||
                country.get(0)[0].equals(SLV.name()) ||
                country.get(0)[0].equals(NIC.name()) ||
                country.get(0)[0].equals(CRI.name()) ||
                country.get(0)[0].equals(PAN.name()) ||
                country.get(0)[0].equals(BHS.name()) ||
                country.get(0)[0].equals(CUB.name()) ||
                country.get(0)[0].equals(HTI.name()) ||
                country.get(0)[0].equals(JAM.name()) ||
                country.get(0)[0].equals(ATG.name()) ||
                country.get(0)[0].equals(SXM.name()) ||
                country.get(0)[0].equals(BRB.name()) ||
                country.get(0)[0].equals(DMA.name()) ||
                country.get(0)[0].equals(DOM.name()) ||
                country.get(0)[0].equals(GRD.name()) ||
                country.get(0)[0].equals(KNA.name()) ||
                country.get(0)[0].equals(LCA.name()) ||
                country.get(0)[0].equals(VCT.name()) ||
                country.get(0)[0].equals(TTO.name());
    }

    public static boolean ameriqueduSud(List<String[]> country) {
        return country.get(0)[0].equals(BES.name()) ||
                country.get(0)[0].equals(CUW.name()) ||
                country.get(0)[0].equals(ABW.name()) ||
                country.get(0)[0].equals(VEN.name()) ||
                country.get(0)[0].equals(CHL.name()) ||
                country.get(0)[0].equals(URY.name()) ||
                country.get(0)[0].equals(BRA.name()) ||
                country.get(0)[0].equals(ARG.name()) ||
                country.get(0)[0].equals(SUR.name()) ||
                country.get(0)[0].equals(COL.name()) ||
                country.get(0)[0].equals(PER.name()) ||
                country.get(0)[0].equals(ECU.name()) ||
                country.get(0)[0].equals(PRY.name()) ||
                country.get(0)[0].equals(BOL.name()) ||
                country.get(0)[0].equals(GUY.name()) ||
                country.get(0)[0].equals(OWID_SAM.name());
    }

    public static boolean asie(List<String[]> country) {
        return country.get(0)[0].equals(AFG.name()) ||
                country.get(0)[0].equals(SAU.name()) ||
                country.get(0)[0].equals(ARM.name()) ||
                country.get(0)[0].equals(AZE.name()) ||
                country.get(0)[0].equals(BHR.name()) ||
                country.get(0)[0].equals(BGD.name()) ||
                country.get(0)[0].equals(BTN.name()) ||
                country.get(0)[0].equals(MMR.name()) ||
                country.get(0)[0].equals(BRN.name()) ||
                country.get(0)[0].equals(KHM.name()) ||
                country.get(0)[0].equals(CHN.name()) ||
                country.get(0)[0].equals(KOR.name()) ||
                country.get(0)[0].equals(ARE.name()) ||
                country.get(0)[0].equals(GEO.name()) ||
                country.get(0)[0].equals(IND.name()) ||
                country.get(0)[0].equals(IDN.name()) ||
                country.get(0)[0].equals(IRQ.name()) ||
                country.get(0)[0].equals(IRN.name()) ||
                country.get(0)[0].equals(ISR.name()) ||
                country.get(0)[0].equals(JPN.name()) ||
                country.get(0)[0].equals(JOR.name()) ||
                country.get(0)[0].equals(KAZ.name()) ||
                country.get(0)[0].equals(KGZ.name()) ||
                country.get(0)[0].equals(KWT.name()) ||
                country.get(0)[0].equals(LAO.name()) ||
                country.get(0)[0].equals(LBN.name()) ||
                country.get(0)[0].equals(MYS.name()) ||
                country.get(0)[0].equals(MDV.name()) ||
                country.get(0)[0].equals(MNG.name()) ||
                country.get(0)[0].equals(NPL.name()) ||
                country.get(0)[0].equals(OMN.name()) ||
                country.get(0)[0].equals(UZB.name()) ||
                country.get(0)[0].equals(PAK.name()) ||
                country.get(0)[0].equals(PSE.name()) ||
                country.get(0)[0].equals(PHL.name()) ||
                country.get(0)[0].equals(QAT.name()) ||
                country.get(0)[0].equals(RUS.name()) ||
                country.get(0)[0].equals(SGP.name()) ||
                country.get(0)[0].equals(LKA.name()) ||
                country.get(0)[0].equals(SYR.name()) ||
                country.get(0)[0].equals(TWN.name()) ||
                country.get(0)[0].equals(TJK.name()) ||
                country.get(0)[0].equals(THA.name()) ||
                country.get(0)[0].equals(TLS.name()) ||
                country.get(0)[0].equals(TKM.name()) ||
                country.get(0)[0].equals(TUR.name()) ||
                country.get(0)[0].equals(VNM.name()) ||
                country.get(0)[0].equals(YEM.name()) ||
                country.get(0)[0].equals(HKG.name()) ||
                country.get(0)[0].equals(MAC.name()) ||
                country.get(0)[0].equals(OWID_ASI.name());
    }

    public static boolean afrique(List<String[]> country) {
        return country.get(0)[0].equals(ZAF.name()) ||
                country.get(0)[0].equals(DZA.name()) ||
                country.get(0)[0].equals(AGO.name()) ||
                country.get(0)[0].equals(BEN.name()) ||
                country.get(0)[0].equals(BWA.name()) ||
                country.get(0)[0].equals(BFA.name()) ||
                country.get(0)[0].equals(CMR.name()) ||
                country.get(0)[0].equals(CPV.name()) ||
                country.get(0)[0].equals(CAF.name()) ||
                country.get(0)[0].equals(COM.name()) ||
                country.get(0)[0].equals(COG.name()) ||
                country.get(0)[0].equals(COD.name()) ||
                country.get(0)[0].equals(CIV.name()) ||
                country.get(0)[0].equals(DJI.name()) ||
                country.get(0)[0].equals(EGY.name()) ||
                country.get(0)[0].equals(ETH.name()) ||
                country.get(0)[0].equals(SWZ.name()) ||
                country.get(0)[0].equals(GAB.name()) ||
                country.get(0)[0].equals(GMB.name()) ||
                country.get(0)[0].equals(GHA.name()) ||
                country.get(0)[0].equals(GIN.name()) ||
                country.get(0)[0].equals(GNB.name()) ||
                country.get(0)[0].equals(GNQ.name()) ||
                country.get(0)[0].equals(KEN.name()) ||
                country.get(0)[0].equals(LSO.name()) ||
                country.get(0)[0].equals(LBR.name()) ||
                country.get(0)[0].equals(LBY.name()) ||
                country.get(0)[0].equals(MDG.name()) ||
                country.get(0)[0].equals(MWI.name()) ||
                country.get(0)[0].equals(MLI.name()) ||
                country.get(0)[0].equals(MAR.name()) ||
                country.get(0)[0].equals(MUS.name()) ||
                country.get(0)[0].equals(MRT.name()) ||
                country.get(0)[0].equals(MOZ.name()) ||
                country.get(0)[0].equals(NAM.name()) ||
                country.get(0)[0].equals(NER.name()) ||
                country.get(0)[0].equals(NGA.name()) ||
                country.get(0)[0].equals(UGA.name()) ||
                country.get(0)[0].equals(RWA.name()) ||
                country.get(0)[0].equals(STP.name()) ||
                country.get(0)[0].equals(SEN.name()) ||
                country.get(0)[0].equals(SYC.name()) ||
                country.get(0)[0].equals(SLE.name()) ||
                country.get(0)[0].equals(SOM.name()) ||
                country.get(0)[0].equals(SDN.name()) ||
                country.get(0)[0].equals(SSD.name()) ||
                country.get(0)[0].equals(TZA.name()) ||
                country.get(0)[0].equals(TCD.name()) ||
                country.get(0)[0].equals(TGO.name()) ||
                country.get(0)[0].equals(TUN.name()) ||
                country.get(0)[0].equals(ZMB.name()) ||
                country.get(0)[0].equals(ZWE.name()) ||
                country.get(0)[0].equals(OWID_AFR.name()) ||
                country.get(0)[0].equals(BDI.name()) ||
                country.get(0)[0].equals(ERI.name());
    }

    public static boolean oceanie(List<String[]> country) {
        return country.get(0)[0].equals(AUS.name()) ||
                country.get(0)[0].equals(FJI.name()) ||
                country.get(0)[0].equals(KIR.name()) ||
                country.get(0)[0].equals(NRU.name()) ||
                country.get(0)[0].equals(NZL.name()) ||
                country.get(0)[0].equals(PNG.name()) ||
                country.get(0)[0].equals(SLB.name()) ||
                country.get(0)[0].equals(WSM.name()) ||
                country.get(0)[0].equals(TON.name()) ||
                country.get(0)[0].equals(TUV.name()) ||
                country.get(0)[0].equals(VUT.name()) ||
                country.get(0)[0].equals(OWID_OCE.name()) ||
                country.get(0)[0].equals(MHL.name()) ||
                country.get(0)[0].equals(FSM.name()) ||
                country.get(0)[0].equals(PMW.name());
    }

    public static boolean monde(List<String[]> country) {
        return europe(country) ||
                amerique(country) ||
                asie(country) ||
                afrique(country) ||
                oceanie(country) ||
                country.get(0)[0].equals(OWID_WRL.name());
    }

    public static boolean continents(List<String[]> country) {
        return country.get(0)[0].equals(OWID_EUR.name()) ||
                country.get(0)[0].equals(OWID_NAM.name()) ||
                country.get(0)[0].equals(OWID_SAM.name()) ||
                country.get(0)[0].equals(OWID_ASI.name()) ||
                country.get(0)[0].equals(OWID_AFR.name()) ||
                country.get(0)[0].equals(OWID_OCE.name()) ||
                country.get(0)[0].equals(OWID_WRL.name());
    }

    public static boolean groupe(List<String[]> country) {
        return country.get(0)[0].equals(OWID_HIC.name()) ||
                country.get(0)[0].equals(OWID_UMC.name()) ||
                country.get(0)[0].equals(OWID_LMC.name()) ||
                country.get(0)[0].equals(OWID_LIC.name());
    }

    public static boolean mondePays(List<String[]> country) {
        return europe(country) &&
                !country.get(0)[0].equals(OWID_EUR.name()) ||
                amerique(country) &&
                !country.get(0)[0].equals(OWID_NAM.name()) &&
                !country.get(0)[0].equals(OWID_SAM.name()) ||
                asie(country) &&
                !country.get(0)[0].equals(OWID_ASI.name()) ||
                afrique(country) &&
                !country.get(0)[0].equals(OWID_AFR.name()) ||
                oceanie(country) &&
                !country.get(0)[0].equals(OWID_OCE.name());
    }

}
