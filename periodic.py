# Define the periodic table as a dictionary
periodic_table = {
    1: {"name": "Hydrogen", "symbol": "H", "atomic_number": 1, "atomic_mass": 1.008},
    2: {"name": "Helium", "symbol": "He", "atomic_number": 2, "atomic_mass": 4.0026},
    3: {"name": "Lithium", "symbol": "Li", "atomic_number": 3, "atomic_mass": 6.94},
    4: {"name": "Beryllium", "symbol": "Be", "atomic_number": 4, "atomic_mass": 9.0122},
    5: {"name": "Boron", "symbol": "B", "atomic_number": 5, "atomic_mass": 10.81},
    6: {"name": "Carbon", "symbol": "C", "atomic_number": 6, "atomic_mass": 12.011},
    7: {"name": "Nitrogen", "symbol": "N", "atomic_number": 7, "atomic_mass": 14.007},
    8: {"name": "Oxygen", "symbol": "O", "atomic_number": 8, "atomic_mass": 15.999},
    9: {"name": "Fluorine", "symbol": "F", "atomic_number": 9, "atomic_mass": 18.998},
    10: {"name": "Neon", "symbol": "Ne", "atomic_number": 10, "atomic_mass": 20.180},
}

# Function to display the periodic table in a readable format
def display_periodic_table():
    print(f"{'Atomic Number':<15}{'Element Name':<15}{'Symbol':<10}{'Atomic Mass'}")
    print("=" * 50)
    
    for number, element in periodic_table.items():
        print(f"{element['atomic_number']:<15}{element['name']:<15}{element['symbol']:<10}{element['atomic_mass']}")

# Display the periodic table
display_periodic_table()