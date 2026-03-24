

from unittest import TestCase

from mini_parking_lot_system_function_class import mini_parking_lot_system, park_your_car, remove_car_from_parking_lot, check_parking_space_status, exit_parking_lot_app


class Parking_Lot_System(TestCase):

    def test_that_parking_space_is_free(self):
        slots = mini_parking_lot_system()
        self.assertEqual(len(slots), 20)

        

