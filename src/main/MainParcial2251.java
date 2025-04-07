package main;

import core.Asistente;
import core.Camion;
import core.Conductor;
import core.TrashCity;
import core.PuntoGeografico;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainParcial2251 {
    
    public static void main(String[] args) {
        ArrayList<PuntoGeografico> puntos;

        TrashCity trashCity = new TrashCity();

        trashCity.addEmpleado(new Conductor(822888886, "Juan Perez", 42, 1732529.01));
        trashCity.addEmpleado(new Conductor(328375723, "Maria Gomez", 32, 1077488.80));
        trashCity.addEmpleado(new Conductor(686208804, "Carlos Sanchez", 47, 4425402.68));
        trashCity.addEmpleado(new Conductor(59757082, "Ana Torres", 27, 1804428.42));
        trashCity.addEmpleado(new Conductor(821719002, "Luis Martinez", 23, 4904605.80));
        trashCity.addEmpleado(new Conductor(25454856, "Sofia Castro", 19, 3044204.50));
        trashCity.addEmpleado(new Conductor(182136228, "Andres Ramirez", 40, 3171796.73));
        trashCity.addEmpleado(new Conductor(312947525, "Laura Jimenez", 36, 3061324.76));
        trashCity.addEmpleado(new Conductor(837947571, "Diego Morales", 59, 3569737.38));
        trashCity.addEmpleado(new Conductor(98813715, "Camila Vargas", 47, 4091225.69));

        trashCity.addEmpleado(new Asistente(134210699, "Felipe Herrera", 53, 4161416.09));
        trashCity.addEmpleado(new Asistente(32286990, "Valentina Ruiz", 35, 1674222.38));
        trashCity.addEmpleado(new Asistente(690053513, "Sebastian Torres", 58, 1237598.51));
        trashCity.addEmpleado(new Asistente(622053180, "Isabella Castro", 38, 1868859.59));
        trashCity.addEmpleado(new Asistente(819869680, "Mateo Jimenez", 40, 3595914.64));
        trashCity.addEmpleado(new Asistente(946766653, "Daniela Morales", 58, 3931888.39));
        trashCity.addEmpleado(new Asistente(574505752, "Samuel Vargas", 53, 2820151.03));
        trashCity.addEmpleado(new Asistente(863126816, "Natalia Herrera", 28, 4087407.91));
        trashCity.addEmpleado(new Asistente(849228079, "Emilia Ruiz", 18, 2985131.57));
        trashCity.addEmpleado(new Asistente(579520541, "Lucas Torres", 44, 1263996.67));
        trashCity.addEmpleado(new Asistente(909208999, "Victoria Castro", 54, 1064845.16));
        trashCity.addEmpleado(new Asistente(928280610, "Gabriel Jimenez", 31, 2738321.50));
        trashCity.addEmpleado(new Asistente(812811719, "Santiago Morales", 57, 1022192.10));
        trashCity.addEmpleado(new Asistente(502229637, "Juliana Vargas", 53, 4491458.37));
        trashCity.addEmpleado(new Asistente(610369468, "Juanita Herrera", 19, 4210032.24));
        trashCity.addEmpleado(new Asistente(741802739, "Emmanuel Ruiz", 55, 1563985.28));
        trashCity.addEmpleado(new Asistente(146131806, "Jose Torres", 51, 3161357.55));
        trashCity.addEmpleado(new Asistente(10800027, "Lina Castro", 49, 4346486.58));
        trashCity.addEmpleado(new Asistente(816927149, "Cristian Jimenez", 56, 2262700.42));
        trashCity.addEmpleado(new Asistente(89655348, "Mariana Morales", 52, 4497951.38));

        trashCity.addCamion(new Camion(1419526, "ABC123", "Renault"));
        trashCity.addCamion(new Camion(6346545, "DEF456", "Chevrolet"));
        trashCity.addCamion(new Camion(1629865, "GHI789", "Mazda"));
        trashCity.addCamion(new Camion(4285172, "JKL012", "Toyota"));
        trashCity.addCamion(new Camion(9442519, "MNO345", "Kia"));
        trashCity.addCamion(new Camion(6975868, "PQR678", "Hyundai"));
        trashCity.addCamion(new Camion(1189544, "STU901", "Nissan"));
        trashCity.addCamion(new Camion(4321235, "VWX234", "Ford"));
        trashCity.addCamion(new Camion(4360973, "YZA567", "Volkswagen"));
        trashCity.addCamion(new Camion(7063630, "BCD890", "Honda"));

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(0.90186, -72.75719));
        puntos.add(new PuntoGeografico(0.33829, -74.20668));
        puntos.add(new PuntoGeografico(1.69559, -75.19255));
        puntos.add(new PuntoGeografico(6.96997, -72.11922));
        puntos.add(new PuntoGeografico(4.97743, -72.05338));
        puntos.add(new PuntoGeografico(6.37976, -71.44464));
        puntos.add(new PuntoGeografico(4.72882, -74.19344));
        puntos.add(new PuntoGeografico(0.60411, -70.66763));
        puntos.add(new PuntoGeografico(4.46327, -67.68367));
        puntos.add(new PuntoGeografico(4.71434, -71.23128));
        puntos.add(new PuntoGeografico(3.47660, -70.79802));
        puntos.add(new PuntoGeografico(5.24763, -70.47752));
        puntos.add(new PuntoGeografico(0.95461, -74.26045));
        puntos.add(new PuntoGeografico(4.16350, -73.16374));
        puntos.add(new PuntoGeografico(4.89214, -72.32230));
        puntos.add(new PuntoGeografico(3.96436, -70.84192));
        puntos.add(new PuntoGeografico(3.69385, -70.33421));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(4.61614, -69.16879));
        puntos.add(new PuntoGeografico(9.13128, -75.36503));
        puntos.add(new PuntoGeografico(8.07416, -78.20175));
        puntos.add(new PuntoGeografico(4.21636, -73.32867));
        puntos.add(new PuntoGeografico(2.30161, -70.27785));
        puntos.add(new PuntoGeografico(7.26287, -69.78874));
        puntos.add(new PuntoGeografico(1.16745, -72.97977));
        puntos.add(new PuntoGeografico(0.34226, -69.93986));
        puntos.add(new PuntoGeografico(6.13730, -67.21739));
        puntos.add(new PuntoGeografico(-1.25439, -75.22840));
        puntos.add(new PuntoGeografico(2.65886, -69.83245));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(3.81073, -68.29800));
        puntos.add(new PuntoGeografico(4.93642, -69.44452));
        puntos.add(new PuntoGeografico(5.60213, -72.32775));
        puntos.add(new PuntoGeografico(4.47340, -72.09374));
        puntos.add(new PuntoGeografico(4.74431, -73.69640));
        puntos.add(new PuntoGeografico(0.86452, -72.88951));
        puntos.add(new PuntoGeografico(6.29541, -69.47368));
        puntos.add(new PuntoGeografico(-0.57607, -73.23155));
        puntos.add(new PuntoGeografico(4.18400, -70.42144));
        puntos.add(new PuntoGeografico(4.48763, -66.72474));
        puntos.add(new PuntoGeografico(9.76940, -77.05244));
        puntos.add(new PuntoGeografico(7.78952, -72.05094));
        puntos.add(new PuntoGeografico(1.38547, -69.13217));
        puntos.add(new PuntoGeografico(2.94810, -68.23774));
        puntos.add(new PuntoGeografico(1.44070, -70.89167));
        puntos.add(new PuntoGeografico(2.41375, -73.10097));
        puntos.add(new PuntoGeografico(5.72663, -73.38907));
        puntos.add(new PuntoGeografico(-0.97485, -70.65816));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(2.23267, -71.77056));
        puntos.add(new PuntoGeografico(4.57729, -72.57919));
        puntos.add(new PuntoGeografico(5.78314, -71.99979));
        puntos.add(new PuntoGeografico(2.48273, -70.53609));
        puntos.add(new PuntoGeografico(4.37622, -74.42125));
        puntos.add(new PuntoGeografico(7.47828, -70.66774));
        puntos.add(new PuntoGeografico(6.48277, -79.96022));
        puntos.add(new PuntoGeografico(3.29115, -73.52723));
        puntos.add(new PuntoGeografico(6.22665, -70.49908));
        puntos.add(new PuntoGeografico(9.12009, -76.04316));
        puntos.add(new PuntoGeografico(0.36932, -73.66112));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(2.02691, -69.37702));
        puntos.add(new PuntoGeografico(7.80982, -65.42437));
        puntos.add(new PuntoGeografico(-1.75753, -75.93686));
        puntos.add(new PuntoGeografico(0.93654, -71.56523));
        puntos.add(new PuntoGeografico(5.16790, -68.86341));
        puntos.add(new PuntoGeografico(4.49119, -67.63724));
        puntos.add(new PuntoGeografico(7.46559, -77.04132));
        puntos.add(new PuntoGeografico(5.14704, -78.46141));
        puntos.add(new PuntoGeografico(5.05173, -74.96543));
        puntos.add(new PuntoGeografico(1.57300, -72.08537));
        puntos.add(new PuntoGeografico(2.31236, -72.33536));
        puntos.add(new PuntoGeografico(2.92271, -72.38302));
        puntos.add(new PuntoGeografico(5.05097, -76.17040));
        puntos.add(new PuntoGeografico(7.01966, -70.63856));
        puntos.add(new PuntoGeografico(2.54529, -73.41134));
        puntos.add(new PuntoGeografico(8.98738, -73.12421));
        puntos.add(new PuntoGeografico(1.82856, -68.95705));
        puntos.add(new PuntoGeografico(-1.19640, -71.23951));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(4.34165, -75.21722));
        puntos.add(new PuntoGeografico(1.90596, -70.00343));
        puntos.add(new PuntoGeografico(3.06194, -73.20901));
        puntos.add(new PuntoGeografico(-1.35195, -69.56247));
        puntos.add(new PuntoGeografico(9.80171, -73.21134));
        puntos.add(new PuntoGeografico(-0.87143, -78.26509));
        puntos.add(new PuntoGeografico(9.16642, -71.42462));
        puntos.add(new PuntoGeografico(6.14839, -67.55143));
        puntos.add(new PuntoGeografico(5.54323, -72.46386));
        puntos.add(new PuntoGeografico(6.99142, -70.12174));
        puntos.add(new PuntoGeografico(4.88889, -74.73244));
        puntos.add(new PuntoGeografico(-0.06722, -71.19310));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(8.53252, -73.25908));
        puntos.add(new PuntoGeografico(4.25135, -69.67217));
        puntos.add(new PuntoGeografico(5.80490, -73.41337));
        puntos.add(new PuntoGeografico(6.18879, -70.67010));
        puntos.add(new PuntoGeografico(4.26254, -68.27503));
        puntos.add(new PuntoGeografico(-2.27533, -65.81567));
        puntos.add(new PuntoGeografico(2.46687, -74.93635));
        puntos.add(new PuntoGeografico(8.29223, -73.26527));
        puntos.add(new PuntoGeografico(4.42275, -72.38048));
        puntos.add(new PuntoGeografico(3.86909, -69.32503));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(6.68180, -67.42808));
        puntos.add(new PuntoGeografico(8.61894, -66.54627));
        puntos.add(new PuntoGeografico(5.26948, -73.77712));
        puntos.add(new PuntoGeografico(-0.52067, -73.72602));
        puntos.add(new PuntoGeografico(-0.30131, -72.09967));
        puntos.add(new PuntoGeografico(10.20081, -73.50848));
        puntos.add(new PuntoGeografico(2.71632, -69.54405));
        puntos.add(new PuntoGeografico(4.26853, -70.15034));
        puntos.add(new PuntoGeografico(2.99658, -70.27889));
        puntos.add(new PuntoGeografico(1.00678, -73.46259));
        puntos.add(new PuntoGeografico(3.19558, -73.05200));
        puntos.add(new PuntoGeografico(4.71402, -73.30140));
        puntos.add(new PuntoGeografico(1.36692, -73.30684));
        puntos.add(new PuntoGeografico(6.35513, -73.44998));
        puntos.add(new PuntoGeografico(5.33962, -70.83768));
        puntos.add(new PuntoGeografico(6.18552, -71.01391));
        puntos.add(new PuntoGeografico(3.99471, -71.94412));
        puntos.add(new PuntoGeografico(-0.03282, -72.02251));
        puntos.add(new PuntoGeografico(10.01230, -70.46750));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(4.25449, -74.14830));
        puntos.add(new PuntoGeografico(5.59146, -71.17635));
        puntos.add(new PuntoGeografico(6.34072, -73.43649));
        puntos.add(new PuntoGeografico(-0.15022, -72.19058));
        puntos.add(new PuntoGeografico(6.87762, -71.32754));
        puntos.add(new PuntoGeografico(10.59245, -72.19127));
        puntos.add(new PuntoGeografico(4.84394, -71.26949));
        puntos.add(new PuntoGeografico(2.16095, -71.68479));
        puntos.add(new PuntoGeografico(8.53051, -72.85590));
        puntos.add(new PuntoGeografico(2.28064, -75.07404));
        puntos.add(new PuntoGeografico(3.39497, -71.96107));
        puntos.add(new PuntoGeografico(7.10314, -72.97555));
        puntos.add(new PuntoGeografico(7.34721, -67.40746));
        puntos.add(new PuntoGeografico(6.17502, -71.98939));
        puntos.add(new PuntoGeografico(3.01286, -69.38672));
        puntos.add(new PuntoGeografico(2.93096, -69.70869));
        trashCity.addRuta(puntos);

        puntos = new ArrayList<>();
        puntos.add(new PuntoGeografico(2.88747, -70.38822));
        puntos.add(new PuntoGeografico(3.99846, -73.31899));
        puntos.add(new PuntoGeografico(3.59599, -73.39876));
        puntos.add(new PuntoGeografico(5.70010, -69.35414));
        puntos.add(new PuntoGeografico(7.93761, -71.86007));
        puntos.add(new PuntoGeografico(1.51960, -75.64728));
        puntos.add(new PuntoGeografico(3.80175, -73.29724));
        puntos.add(new PuntoGeografico(3.01491, -69.03773));
        puntos.add(new PuntoGeografico(-0.09660, -74.82339));
        puntos.add(new PuntoGeografico(4.49346, -71.08875));
        puntos.add(new PuntoGeografico(1.10246, -68.68309));
        puntos.add(new PuntoGeografico(5.10040, -71.51047));
        puntos.add(new PuntoGeografico(1.32857, -69.74571));
        puntos.add(new PuntoGeografico(4.63118, -73.90958));
        puntos.add(new PuntoGeografico(4.35993, -70.74652));
        puntos.add(new PuntoGeografico(3.54657, -67.09195));
        puntos.add(new PuntoGeografico(4.76401, -73.41233));
        puntos.add(new PuntoGeografico(1.98796, -74.16922));
        puntos.add(new PuntoGeografico(4.38077, -71.66210));
        trashCity.addRuta(puntos);

        trashCity.addTurno(0, trashCity.getCamion(1419526), trashCity.getEmpleado(328375723), trashCity.getEmpleado(89655348), trashCity.getEmpleado(909208999), trashCity.getRuta(3));
        trashCity.addTurno(1, trashCity.getCamion(1189544), trashCity.getEmpleado(686208804), trashCity.getEmpleado(741802739), trashCity.getEmpleado(579520541), trashCity.getRuta(4));
        trashCity.addTurno(2, trashCity.getCamion(7063630), trashCity.getEmpleado(822888886), trashCity.getEmpleado(146131806), trashCity.getEmpleado(10800027), trashCity.getRuta(5));
        trashCity.addTurno(3, trashCity.getCamion(4360973), trashCity.getEmpleado(821719002), trashCity.getEmpleado(10800027), trashCity.getEmpleado(909208999), trashCity.getRuta(9));
        trashCity.addTurno(4, trashCity.getCamion(7063630), trashCity.getEmpleado(59757082), trashCity.getEmpleado(816927149), trashCity.getEmpleado(863126816), trashCity.getRuta(9));
        trashCity.addTurno(5, trashCity.getCamion(4321235), trashCity.getEmpleado(328375723), trashCity.getEmpleado(819869680), trashCity.getEmpleado(863126816), trashCity.getRuta(9));
        trashCity.addTurno(6, trashCity.getCamion(6346545), trashCity.getEmpleado(837947571), trashCity.getEmpleado(622053180), trashCity.getEmpleado(134210699), trashCity.getRuta(5));
        trashCity.addTurno(7, trashCity.getCamion(7063630), trashCity.getEmpleado(837947571), trashCity.getEmpleado(863126816), trashCity.getEmpleado(32286990), trashCity.getRuta(6));
        trashCity.addTurno(8, trashCity.getCamion(6975868), trashCity.getEmpleado(821719002), trashCity.getEmpleado(812811719), trashCity.getEmpleado(741802739), trashCity.getRuta(1));
        trashCity.addTurno(9, trashCity.getCamion(9442519), trashCity.getEmpleado(182136228), trashCity.getEmpleado(146131806), trashCity.getEmpleado(928280610), trashCity.getRuta(5));
        trashCity.addTurno(10, trashCity.getCamion(4321235), trashCity.getEmpleado(686208804), trashCity.getEmpleado(622053180), trashCity.getEmpleado(812811719), trashCity.getRuta(9));
        trashCity.addTurno(11, trashCity.getCamion(4285172), trashCity.getEmpleado(25454856), trashCity.getEmpleado(741802739), trashCity.getEmpleado(89655348), trashCity.getRuta(1));
        trashCity.addTurno(12, trashCity.getCamion(1419526), trashCity.getEmpleado(59757082), trashCity.getEmpleado(909208999), trashCity.getEmpleado(10800027), trashCity.getRuta(4));
        trashCity.addTurno(13, trashCity.getCamion(4321235), trashCity.getEmpleado(312947525), trashCity.getEmpleado(574505752), trashCity.getEmpleado(816927149), trashCity.getRuta(2));
        trashCity.addTurno(14, trashCity.getCamion(7063630), trashCity.getEmpleado(59757082), trashCity.getEmpleado(946766653), trashCity.getEmpleado(909208999), trashCity.getRuta(0));
        trashCity.addTurno(15, trashCity.getCamion(4321235), trashCity.getEmpleado(821719002), trashCity.getEmpleado(610369468), trashCity.getEmpleado(579520541), trashCity.getRuta(1));
        trashCity.addTurno(16, trashCity.getCamion(4321235), trashCity.getEmpleado(25454856), trashCity.getEmpleado(89655348), trashCity.getEmpleado(502229637), trashCity.getRuta(6));
        trashCity.addTurno(17, trashCity.getCamion(1419526), trashCity.getEmpleado(98813715), trashCity.getEmpleado(863126816), trashCity.getEmpleado(622053180), trashCity.getRuta(7));
        trashCity.addTurno(18, trashCity.getCamion(4360973), trashCity.getEmpleado(312947525), trashCity.getEmpleado(946766653), trashCity.getEmpleado(134210699), trashCity.getRuta(4));
        trashCity.addTurno(19, trashCity.getCamion(9442519), trashCity.getEmpleado(837947571), trashCity.getEmpleado(741802739), trashCity.getEmpleado(819869680), trashCity.getRuta(3));
        trashCity.addTurno(20, trashCity.getCamion(4360973), trashCity.getEmpleado(59757082), trashCity.getEmpleado(849228079), trashCity.getEmpleado(146131806), trashCity.getRuta(4));
        trashCity.addTurno(21, trashCity.getCamion(1629865), trashCity.getEmpleado(821719002), trashCity.getEmpleado(134210699), trashCity.getEmpleado(146131806), trashCity.getRuta(2));
        trashCity.addTurno(22, trashCity.getCamion(6975868), trashCity.getEmpleado(837947571), trashCity.getEmpleado(863126816), trashCity.getEmpleado(574505752), trashCity.getRuta(2));
        trashCity.addTurno(23, trashCity.getCamion(6346545), trashCity.getEmpleado(328375723), trashCity.getEmpleado(812811719), trashCity.getEmpleado(89655348), trashCity.getRuta(9));
        trashCity.addTurno(24, trashCity.getCamion(4285172), trashCity.getEmpleado(822888886), trashCity.getEmpleado(819869680), trashCity.getEmpleado(146131806), trashCity.getRuta(9));
        trashCity.addTurno(25, trashCity.getCamion(1419526), trashCity.getEmpleado(182136228), trashCity.getEmpleado(909208999), trashCity.getEmpleado(502229637), trashCity.getRuta(6));
        trashCity.addTurno(26, trashCity.getCamion(6346545), trashCity.getEmpleado(328375723), trashCity.getEmpleado(741802739), trashCity.getEmpleado(89655348), trashCity.getRuta(0));
        trashCity.addTurno(27, trashCity.getCamion(9442519), trashCity.getEmpleado(822888886), trashCity.getEmpleado(10800027), trashCity.getEmpleado(502229637), trashCity.getRuta(7));
        trashCity.addTurno(28, trashCity.getCamion(6346545), trashCity.getEmpleado(686208804), trashCity.getEmpleado(574505752), trashCity.getEmpleado(946766653), trashCity.getRuta(1));
        trashCity.addTurno(29, trashCity.getCamion(1629865), trashCity.getEmpleado(25454856), trashCity.getEmpleado(928280610), trashCity.getEmpleado(10800027), trashCity.getRuta(8));
        trashCity.addTurno(30, trashCity.getCamion(9442519), trashCity.getEmpleado(837947571), trashCity.getEmpleado(502229637), trashCity.getEmpleado(32286990), trashCity.getRuta(5));
        trashCity.addTurno(31, trashCity.getCamion(1189544), trashCity.getEmpleado(25454856), trashCity.getEmpleado(812811719), trashCity.getEmpleado(622053180), trashCity.getRuta(1));
        trashCity.addTurno(32, trashCity.getCamion(9442519), trashCity.getEmpleado(98813715), trashCity.getEmpleado(579520541), trashCity.getEmpleado(610369468), trashCity.getRuta(4));
        trashCity.addTurno(33, trashCity.getCamion(1419526), trashCity.getEmpleado(312947525), trashCity.getEmpleado(812811719), trashCity.getEmpleado(10800027), trashCity.getRuta(4));
        trashCity.addTurno(34, trashCity.getCamion(1189544), trashCity.getEmpleado(822888886), trashCity.getEmpleado(928280610), trashCity.getEmpleado(10800027), trashCity.getRuta(6));
        trashCity.addTurno(35, trashCity.getCamion(4321235), trashCity.getEmpleado(686208804), trashCity.getEmpleado(502229637), trashCity.getEmpleado(849228079), trashCity.getRuta(9));
        trashCity.addTurno(36, trashCity.getCamion(1189544), trashCity.getEmpleado(59757082), trashCity.getEmpleado(89655348), trashCity.getEmpleado(816927149), trashCity.getRuta(2));
        trashCity.addTurno(37, trashCity.getCamion(4321235), trashCity.getEmpleado(821719002), trashCity.getEmpleado(32286990), trashCity.getEmpleado(622053180), trashCity.getRuta(4));
        trashCity.addTurno(38, trashCity.getCamion(7063630), trashCity.getEmpleado(312947525), trashCity.getEmpleado(579520541), trashCity.getEmpleado(816927149), trashCity.getRuta(6));
        trashCity.addTurno(39, trashCity.getCamion(6975868), trashCity.getEmpleado(837947571), trashCity.getEmpleado(610369468), trashCity.getEmpleado(622053180), trashCity.getRuta(5));
        trashCity.addTurno(40, trashCity.getCamion(6346545), trashCity.getEmpleado(837947571), trashCity.getEmpleado(574505752), trashCity.getEmpleado(741802739), trashCity.getRuta(7));
        trashCity.addTurno(41, trashCity.getCamion(7063630), trashCity.getEmpleado(98813715), trashCity.getEmpleado(819869680), trashCity.getEmpleado(610369468), trashCity.getRuta(3));
        trashCity.addTurno(42, trashCity.getCamion(9442519), trashCity.getEmpleado(25454856), trashCity.getEmpleado(574505752), trashCity.getEmpleado(32286990), trashCity.getRuta(0));
        trashCity.addTurno(43, trashCity.getCamion(6346545), trashCity.getEmpleado(837947571), trashCity.getEmpleado(812811719), trashCity.getEmpleado(741802739), trashCity.getRuta(5));
        trashCity.addTurno(44, trashCity.getCamion(4360973), trashCity.getEmpleado(822888886), trashCity.getEmpleado(946766653), trashCity.getEmpleado(502229637), trashCity.getRuta(5));
        trashCity.addTurno(45, trashCity.getCamion(4321235), trashCity.getEmpleado(822888886), trashCity.getEmpleado(812811719), trashCity.getEmpleado(946766653), trashCity.getRuta(1));
        trashCity.addTurno(46, trashCity.getCamion(6346545), trashCity.getEmpleado(821719002), trashCity.getEmpleado(946766653), trashCity.getEmpleado(622053180), trashCity.getRuta(3));
        trashCity.addTurno(47, trashCity.getCamion(1419526), trashCity.getEmpleado(98813715), trashCity.getEmpleado(863126816), trashCity.getEmpleado(946766653), trashCity.getRuta(1));
        trashCity.addTurno(48, trashCity.getCamion(4285172), trashCity.getEmpleado(98813715), trashCity.getEmpleado(622053180), trashCity.getEmpleado(32286990), trashCity.getRuta(3));
        trashCity.addTurno(49, trashCity.getCamion(6346545), trashCity.getEmpleado(182136228), trashCity.getEmpleado(579520541), trashCity.getEmpleado(909208999), trashCity.getRuta(0));

        trashCity.getTurno(0).ejecutar(LocalDateTime.of(2025, 1, 24, 2, 47), 4);
        trashCity.getTurno(0).clasificarResiduos(16.360, 13.896, 4.112, 18.797, 19.965);

        trashCity.getTurno(1).ejecutar(LocalDateTime.of(2025, 1, 15, 6, 3), 5);
        trashCity.getTurno(1).clasificarResiduos(14.416, 11.331, 11.863, 11.349, 12.532);

        trashCity.getTurno(2).ejecutar(LocalDateTime.of(2025, 1, 22, 18, 58), 2);
        trashCity.getTurno(2).clasificarResiduos(17.916, 1.905, 19.881, 18.998, 13.011);

        trashCity.getTurno(3).ejecutar(LocalDateTime.of(2025, 1, 2, 20, 2), 2);
        trashCity.getTurno(3).clasificarResiduos(8.766, 10.098, 15.541, 0.474, 15.902);

        trashCity.getTurno(4).ejecutar(LocalDateTime.of(2025, 1, 2, 14, 6), 3);
        trashCity.getTurno(4).clasificarResiduos(5.315, 4.755, 15.752, 15.036, 8.915);

        trashCity.getTurno(5).ejecutar(LocalDateTime.of(2025, 1, 23, 2, 5), 4);
        trashCity.getTurno(5).clasificarResiduos(2.384, 19.967, 4.836, 3.081, 5.898);

        trashCity.getTurno(6).ejecutar(LocalDateTime.of(2025, 1, 10, 8, 41), 1);
        trashCity.getTurno(6).clasificarResiduos(14.116, 2.935, 4.623, 8.823, 16.206);

        trashCity.getTurno(7).ejecutar(LocalDateTime.of(2025, 1, 11, 21, 25), 5);
        trashCity.getTurno(7).clasificarResiduos(16.126, 0.750, 8.774, 16.159, 7.459);

        trashCity.getTurno(8).ejecutar(LocalDateTime.of(2025, 1, 18, 14, 52), 4);
        trashCity.getTurno(8).clasificarResiduos(19.110, 16.468, 10.616, 15.414, 19.788);

        trashCity.getTurno(9).ejecutar(LocalDateTime.of(2025, 1, 20, 20, 54), 3);
        trashCity.getTurno(9).clasificarResiduos(9.121, 16.919, 16.097, 17.499, 8.432);

        trashCity.getTurno(10).ejecutar(LocalDateTime.of(2025, 1, 6, 13, 16), 3);
        trashCity.getTurno(10).clasificarResiduos(15.532, 5.703, 3.468, 7.390, 9.921);

        trashCity.getTurno(11).ejecutar(LocalDateTime.of(2025, 1, 7, 12, 15), 5);
        trashCity.getTurno(11).clasificarResiduos(0.095, 15.641, 17.720, 14.247, 19.432);

        trashCity.getTurno(12).ejecutar(LocalDateTime.of(2025, 1, 16, 6, 32), 5);
        trashCity.getTurno(12).clasificarResiduos(3.832, 0.140, 12.091, 6.589, 5.982);

        trashCity.getTurno(13).ejecutar(LocalDateTime.of(2025, 1, 27, 5, 38), 1);
        trashCity.getTurno(13).clasificarResiduos(8.171, 11.064, 10.684, 3.778, 2.458);

        trashCity.getTurno(14).ejecutar(LocalDateTime.of(2025, 1, 11, 11, 29), 5);
        trashCity.getTurno(14).clasificarResiduos(15.976, 18.824, 8.104, 1.146, 11.144);

        trashCity.getTurno(15).ejecutar(LocalDateTime.of(2025, 1, 30, 1, 4), 4);
        trashCity.getTurno(15).clasificarResiduos(16.060, 17.376, 14.695, 11.138, 15.718);

        trashCity.getTurno(16).ejecutar(LocalDateTime.of(2025, 1, 25, 13, 54), 1);
        trashCity.getTurno(16).clasificarResiduos(8.928, 7.163, 2.709, 13.980, 10.502);

        trashCity.getTurno(17).ejecutar(LocalDateTime.of(2025, 1, 17, 6, 41), 1);
        trashCity.getTurno(17).clasificarResiduos(9.172, 1.459, 9.848, 0.863, 16.751);

        trashCity.getTurno(18).ejecutar(LocalDateTime.of(2025, 1, 25, 1, 23), 2);
        trashCity.getTurno(18).clasificarResiduos(10.997, 10.821, 18.225, 18.068, 6.020);

        trashCity.getTurno(19).ejecutar(LocalDateTime.of(2025, 1, 6, 1, 52), 3);
        trashCity.getTurno(19).clasificarResiduos(12.396, 12.587, 11.666, 15.825, 8.569);

        trashCity.getTurno(20).ejecutar(LocalDateTime.of(2025, 1, 26, 14, 12), 2);
        trashCity.getTurno(20).clasificarResiduos(2.366, 10.560, 17.167, 4.721, 1.069);

        trashCity.getTurno(21).ejecutar(LocalDateTime.of(2025, 1, 14, 12, 39), 1);
        trashCity.getTurno(21).clasificarResiduos(12.162, 14.363, 11.642, 9.351, 0.861);

        trashCity.getTurno(22).ejecutar(LocalDateTime.of(2025, 1, 7, 1, 20), 1);
        trashCity.getTurno(22).clasificarResiduos(4.508, 13.845, 0.820, 2.651, 17.986);

        trashCity.getTurno(23).ejecutar(LocalDateTime.of(2025, 1, 10, 22, 38), 2);
        trashCity.getTurno(23).clasificarResiduos(10.834, 2.344, 13.538, 15.033, 19.405);

        trashCity.getTurno(24).ejecutar(LocalDateTime.of(2025, 1, 21, 5, 41), 3);
        trashCity.getTurno(24).clasificarResiduos(11.212, 13.107, 13.443, 11.174, 7.877);

        trashCity.getTurno(25).ejecutar(LocalDateTime.of(2025, 1, 28, 12, 9), 4);
        trashCity.getTurno(25).clasificarResiduos(1.970, 11.824, 12.458, 15.257, 14.955);

        trashCity.getTurno(26).ejecutar(LocalDateTime.of(2025, 1, 12, 7, 6), 2);
        trashCity.getTurno(26).clasificarResiduos(10.896, 18.188, 6.414, 12.872, 9.346);

        trashCity.getTurno(27).ejecutar(LocalDateTime.of(2025, 1, 21, 11, 12), 1);
        trashCity.getTurno(27).clasificarResiduos(19.138, 11.704, 11.899, 10.187, 15.586);

        trashCity.getTurno(28).ejecutar(LocalDateTime.of(2025, 1, 30, 20, 15), 2);
        trashCity.getTurno(28).clasificarResiduos(3.391, 16.591, 12.108, 3.361, 13.994);

        trashCity.getTurno(29).ejecutar(LocalDateTime.of(2025, 1, 12, 12, 42), 2);
        trashCity.getTurno(29).clasificarResiduos(3.824, 7.332, 18.083, 12.537, 8.093);

        trashCity.getTurno(30).ejecutar(LocalDateTime.of(2025, 1, 25, 23, 7), 5);
        trashCity.getTurno(30).clasificarResiduos(4.959, 5.332, 6.558, 10.126, 15.579);

        trashCity.getTurno(31).ejecutar(LocalDateTime.of(2025, 1, 29, 22, 41), 3);
        trashCity.getTurno(31).clasificarResiduos(14.657, 7.650, 16.986, 17.548, 6.853);

        trashCity.getTurno(32).ejecutar(LocalDateTime.of(2025, 1, 4, 14, 31), 5);
        trashCity.getTurno(32).clasificarResiduos(5.038, 1.314, 9.377, 19.500, 9.210);

        trashCity.getTurno(33).ejecutar(LocalDateTime.of(2025, 1, 28, 17, 14), 2);
        trashCity.getTurno(33).clasificarResiduos(2.343, 6.690, 15.830, 17.195, 6.935);

        trashCity.getTurno(34).ejecutar(LocalDateTime.of(2025, 1, 10, 21, 48), 4);
        trashCity.getTurno(34).clasificarResiduos(2.744, 7.051, 13.314, 9.281, 0.608);

        trashCity.getTurno(35).ejecutar(LocalDateTime.of(2025, 1, 1, 17, 14), 2);
        trashCity.getTurno(35).clasificarResiduos(0.005, 6.095, 18.942, 6.737, 6.305);

        trashCity.getTurno(36).ejecutar(LocalDateTime.of(2025, 1, 7, 7, 8), 5);
        trashCity.getTurno(36).clasificarResiduos(5.532, 7.663, 11.952, 17.118, 12.252);

        trashCity.getTurno(37).ejecutar(LocalDateTime.of(2025, 1, 8, 14, 54), 4);
        trashCity.getTurno(37).clasificarResiduos(4.003, 16.857, 8.429, 4.670, 6.044);

        trashCity.getTurno(38).ejecutar(LocalDateTime.of(2025, 1, 15, 13, 0), 4);
        trashCity.getTurno(38).clasificarResiduos(14.297, 10.382, 8.634, 15.121, 15.212);

        trashCity.getTurno(39).ejecutar(LocalDateTime.of(2025, 1, 16, 18, 26), 4);
        trashCity.getTurno(39).clasificarResiduos(10.536, 13.104, 7.660, 2.489, 11.821);

        trashCity.getTurno(40).ejecutar(LocalDateTime.of(2025, 1, 27, 4, 40), 1);
        trashCity.getTurno(40).clasificarResiduos(0.926, 8.095, 8.219, 4.416, 2.011);

        trashCity.getTurno(41).ejecutar(LocalDateTime.of(2025, 1, 4, 23, 27), 4);
        trashCity.getTurno(41).clasificarResiduos(1.516, 0.152, 12.335, 4.714, 15.843);

        trashCity.getTurno(42).ejecutar(LocalDateTime.of(2025, 1, 9, 6, 18), 2);
        trashCity.getTurno(42).clasificarResiduos(5.828, 9.434, 2.878, 9.968, 14.523);

        trashCity.getTurno(43).ejecutar(LocalDateTime.of(2025, 1, 12, 2, 34), 4);
        trashCity.getTurno(43).clasificarResiduos(3.139, 12.551, 7.007, 8.010, 2.856);

        trashCity.getTurno(44).ejecutar(LocalDateTime.of(2025, 1, 26, 19, 39), 3);
        trashCity.getTurno(44).clasificarResiduos(15.062, 17.585, 12.068, 5.699, 14.663);

        trashCity.getTurno(45).ejecutar(LocalDateTime.of(2025, 1, 1, 8, 48), 4);
        trashCity.getTurno(45).clasificarResiduos(14.576, 9.394, 13.973, 4.449, 12.476);

        trashCity.getTurno(46).ejecutar(LocalDateTime.of(2025, 1, 21, 21, 23), 2);
        trashCity.getTurno(46).clasificarResiduos(16.871, 6.236, 5.628, 2.170, 0.322);

        trashCity.getTurno(47).ejecutar(LocalDateTime.of(2025, 1, 13, 23, 33), 5);
        trashCity.getTurno(47).clasificarResiduos(16.985, 5.018, 7.253, 8.464, 3.346);

        trashCity.getTurno(48).ejecutar(LocalDateTime.of(2025, 1, 22, 19, 35), 5);
        trashCity.getTurno(48).clasificarResiduos(6.381, 19.755, 11.291, 4.413, 16.264);

        trashCity.getTurno(49).ejecutar(LocalDateTime.of(2025, 1, 20, 14, 23), 3);
        trashCity.getTurno(49).clasificarResiduos(10.874, 4.084, 15.316, 10.370, 6.829);
        
        trashCity.showMinMaxTurnoPorResiduo();
        trashCity.showRutaMaxMetal();
    }
    
}

/**
------------- Resultados -------------

Residuo - Vidrio
- Turno Minimo:
  - ID: 35
  - Camion: VWX234
  - Conductor: Carlos Sanchez
  - Asistente 1: Juliana Vargas
  - Asistente 2: Emilia Ruiz
  - Fecha Inicio: 2025-01-01T17:14
  - Fecha Fin: 2025-01-01T19:14
  - Cantidad: 0.005
- Turno Maximo:
  - ID: 27
  - Camion: MNO345
  - Conductor: Juan Perez
  - Asistente 1: Lina Castro
  - Asistente 2: Juliana Vargas
  - Fecha Inicio: 2025-01-21T11:12
  - Fecha Fin: 2025-01-21T12:12
  - Cantidad: 19.138

Residuo - Papel
- Turno Minimo:
  - ID: 12
  - Camion: ABC123
  - Conductor: Ana Torres
  - Asistente 1: Victoria Castro
  - Asistente 2: Lina Castro
  - Fecha Inicio: 2025-01-16T06:32
  - Fecha Fin: 2025-01-16T11:32
  - Cantidad: 0.14
- Turno Maximo:
  - ID: 5
  - Camion: VWX234
  - Conductor: Maria Gomez
  - Asistente 1: Mateo Jimenez
  - Asistente 2: Natalia Herrera
  - Fecha Inicio: 2025-01-23T02:05
  - Fecha Fin: 2025-01-23T06:05
  - Cantidad: 19.967

Residuo - Plastico
- Turno Minimo:
  - ID: 22
  - Camion: PQR678
  - Conductor: Diego Morales
  - Asistente 1: Natalia Herrera
  - Asistente 2: Samuel Vargas
  - Fecha Inicio: 2025-01-07T01:20
  - Fecha Fin: 2025-01-07T02:20
  - Cantidad: 0.82
- Turno Maximo:
  - ID: 2
  - Camion: BCD890
  - Conductor: Juan Perez
  - Asistente 1: Jose Torres
  - Asistente 2: Lina Castro
  - Fecha Inicio: 2025-01-22T18:58
  - Fecha Fin: 2025-01-22T20:58
  - Cantidad: 19.881

Residuo - Metal
- Turno Minimo:
  - ID: 3
  - Camion: YZA567
  - Conductor: Luis Martinez
  - Asistente 1: Lina Castro
  - Asistente 2: Victoria Castro
  - Fecha Inicio: 2025-01-02T20:02
  - Fecha Fin: 2025-01-02T22:02
  - Cantidad: 0.474
- Turno Maximo:
  - ID: 32
  - Camion: MNO345
  - Conductor: Camila Vargas
  - Asistente 1: Lucas Torres
  - Asistente 2: Juanita Herrera
  - Fecha Inicio: 2025-01-04T14:31
  - Fecha Fin: 2025-01-04T19:31
  - Cantidad: 19.5

Residuo - Residuos Organicos
- Turno Minimo:
  - ID: 46
  - Camion: DEF456
  - Conductor: Luis Martinez
  - Asistente 1: Daniela Morales
  - Asistente 2: Isabella Castro
  - Fecha Inicio: 2025-01-21T21:23
  - Fecha Fin: 2025-01-21T23:23
  - Cantidad: 0.322
- Turno Maximo:
  - ID: 0
  - Camion: ABC123
  - Conductor: Maria Gomez
  - Asistente 1: Mariana Morales
  - Asistente 2: Victoria Castro
  - Fecha Inicio: 2025-01-24T02:47
  - Fecha Fin: 2025-01-24T06:47
  - Cantidad: 19.965

Los puntos de la ruta con mayor cantidad de metal recogido son:
- (2.02691, -69.37702)
- (7.80982, -65.42437)
- (-1.75753, -75.93686)
- (0.93654, -71.56523)
- (5.1679, -68.86341)
- (4.49119, -67.63724)
- (7.46559, -77.04132)
- (5.14704, -78.46141)
- (5.05173, -74.96543)
- (1.573, -72.08537)
- (2.31236, -72.33536)
- (2.92271, -72.38302)
- (5.05097, -76.1704)
- (7.01966, -70.63856)
- (2.54529, -73.41134)
- (8.98738, -73.12421)
- (1.82856, -68.95705)
- (-1.1964, -71.23951)
La cantidad de metal total en la ruta es: 82.092
*/
