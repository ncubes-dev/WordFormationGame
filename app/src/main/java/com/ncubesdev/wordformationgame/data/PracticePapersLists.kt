package com.ncubesdev.zimsecpastexampapersandmarksschemes.data

import androidx.compose.ui.res.painterResource
import com.ncubesdev.zimsecpastexampapersandmarksschemes.R
import com.ncubesdev.zimsecpastexampapersandmarksschemes.dormain.models.PracticeQuestion
import com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.practiceScreen.SubjectCardItem
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants

object PracticePapersLists {
    val aPhysics = listOf<PracticeQuestion>(

        PracticeQuestion(
            "What is work?",
            listOf(
                "The product of force and time.",
                "The displacement of an object.",
                "The energy required to move an object.",
                "The change in velocity of an object."
            ),
            "The product of force and time."
        ),
        PracticeQuestion(
            question = "What is the term for the scattering of light that causes the sky to appear blue?",
            answers = listOf("Reflection", "Refraction", "Dispersion", "Diffraction"),
            answer = "Dispersion"
        ),
        PracticeQuestion(
            "What is the difference between kinetic and potential energy?",
            listOf(
                "Kinetic energy is the energy of motion, while potential energy is the energy of position.",
                "Kinetic energy is the energy of position, while potential energy is the energy of motion.",
                "They are the same thing.",
                "Neither of these options is correct."
            ),
            "Kinetic energy is the energy of motion, while potential energy is the energy of position."
        ),
        PracticeQuestion(
            "What is circular motion?",
            listOf(
                "Motion along a straight line.",
                "Motion along a curved path.",
                "Stationary motion.",
                "Random motion."
            ),
            "Motion along a curved path."
        ),
        PracticeQuestion(
            "What is the formula for centripetal acceleration?",
            listOf("a = F/m", "a = v^2/r", "a = mgh", "a = P/V"),
            "a = v^2/r"
        ),
        PracticeQuestion(
            "What is gravitational field?",
            listOf(
                "A measure of the force due to gravity at a point in space.",
                "A measure of the distance between two objects.",
                "A measure of the mass of an object.",
                "A measure of the speed of light."
            ),
            "A measure of the force due to gravity at a point in space."
        ),
        PracticeQuestion(
            "What is simple harmonic motion?",
            listOf(
                "Oscillatory motion under a linear restoring force proportional to the displacement.",
                "Random motion.",
                "Stationary motion.",
                "Motion along a straight line."
            ),
            "Oscillatory motion under a linear restoring force proportional to the displacement."
        ),
        PracticeQuestion(
            "What are the different types of waves?",
            listOf(
                "Transverse and longitudinal waves.",
                "Sound and light waves.",
                "Radio and television waves.",
                "Electromagnetic and gravitational waves."
            ),
            "Transverse and longitudinal waves."
        ),
        PracticeQuestion(
            "What is superposition principle?",
            listOf(
                "The principle that states that when two or more waves meet at a point, the resultant wave is the sum of the individual waves.",
                "The principle that states that waves cannot exist in the same medium.",
                "The principle that states that waves can only exist in a vacuum.",
                "The principle that states that waves do not interact with each other."
            ),
            "The principle that states that when two or more waves meet at a point, the resultant wave is the sum of the individual waves."
        ),
        PracticeQuestion(
            "What is electric field?",
            listOf(
                "The region around an electric charge where the force due to the charge can be felt.",
                "The distance between two electric charges.",
                "The mass of an electric charge.",
                "The speed of light."
            ),
            "The region around an electric charge where the force due to the charge can be felt."
        ),
        PracticeQuestion(
            "What is capacitance?",
            listOf(
                "The ability of a system to store an electric charge.",
                "The ability of a system to conduct electricity.",
                "The ability of a system to resist the flow of current.",
                "The ability of a system to produce an electromagnetic field."
            ),
            "The ability of a system to store an electric charge."
        ),
        PracticeQuestion(
            "What is Ohm's law?",
            listOf(
                "The current through a conductor between two points is directly proportional to the voltage across the two points.",
                "The resistance of a conductor is directly proportional to the length of the conductor.",
                "The resistance of a conductor is inversely proportional to the cross-sectional area of the conductor.",
                "The power dissipated by a resistor is equal to the product of the current through it and the voltage across it."
            ),
            "The current through a conductor between two points is directly proportional to the voltage across the two points."
        ),
        PracticeQuestion(
            "What type of fluid flow is characterized by constant velocity at different points in the flow?",
            listOf("Laminar flow", "Turbulent flow", "Steady flow", "Unsteady flow"),
            "Steady flow"
        ),
        PracticeQuestion(
            "What is the process called when thermal energy is transferred through direct contact between materials with different temperatures?",
            listOf("Conduction", "Convection", "Radiation", "Induction"),
            "Conduction"
        ),
        PracticeQuestion(
            "Which of the following particles has a positive charge?",
            listOf("Electron", "Proton", "Neutron", "Photon"),
            "Proton"
        ),
        PracticeQuestion(
            "What does the term 'quantum' refer to in quantum physics?",
            listOf(
                "A small amount of something",
                "A large amount of something",
                "A unit of measurement",
                "A type of force"
            ),
            "A small amount of something"
        ),
        PracticeQuestion(
            "What is the maximum number of electrons that can occupy the first energy level of an atom?",
            listOf("1", "2", "4", "8"),
            "2"
        ),
        PracticeQuestion(
            "What type of radiation has no charge and can penetrate most materials?",
            listOf("Alpha radiation", "Beta radiation", "Gamma radiation", "Neutron radiation"),
            "Gamma radiation"
        ),
        PracticeQuestion(
            "What type of communication uses electromagnetic waves to transmit information?",
            listOf(
                "Verbal communication",
                "Nonverbal communication",
                "Radio communication",
                "Satellite communication"
            ),
            "Radio communication"
        ),
        PracticeQuestion(
            "What is the SI unit of power?",
            listOf("Watt", "Joule", "Newton", "Meter"),
            "Watt"
        ),
        PracticeQuestion(
            "What term is used to describe the difference between a measured value and the true value?",
            listOf("Accuracy", "Precision", "Error", "Uncertainty"),
            "Error"
        ),
        PracticeQuestion(
            "What branch of physics deals with the motion of objects?",
            listOf("Kinematics", "Dynamics", "Thermodynamics", "Electromagnetism"),
            "Kinematics"
        ),
        PracticeQuestion(
            "What type of force holds the nucleus of an atom together?",
            listOf("Electromagnetic force", "Gravitational force", "Strong force", "Weak force"),
            "Strong force"
        ),
        PracticeQuestion(
            "What is the phenomenon in which a changing magnetic field induces an electric current?",
            listOf("Conduction", "Convection", "Induction", "Radiation"),
            "Induction"
        ),
        PracticeQuestion(
            "When a wire is moved in a magnetic field, what is induced in the wire?",
            listOf("Heat", "Voltage", "Current", "Resistance"),
            "Voltage"
        ),
        PracticeQuestion(
            "In electrical circuits, what type of current continuously changes direction?",
            listOf("Direct current", "Alternating current", "Transient current", "Pulsed current"),
            "Alternating current"
        ),
        PracticeQuestion(
            "What type of electronic circuit amplifies, filters, or modifies analog signals?",
            listOf(
                "Digital circuit",
                "Analog circuit",
                "Synchronous circuit",
                "Asynchronous circuit"
            ),
            "Analog circuit"
        ),
        PracticeQuestion(
            "What type of logic uses only two values, often represented as 0 and 1?",
            listOf("Analog logic", "Digital logic", "Binary logic", "Boolean logic"),
            "Digital logic"
        ),
        PracticeQuestion(
            "What is the term for the physical state of matter that has neither a definite shape nor volume?",
            listOf("Solid", "Liquid", "Gas", "Plasma"),
            "Gas"
        ),
        PracticeQuestion(
            "What is the term for the change in shape of a material under stress without breaking?",
            listOf("Elastic deformation", "Plastic deformation", "Fracture", "Brittleness"),
            "Elastic deformation"
        ),
        PracticeQuestion(
            "What is the SI unit of temperature?",
            listOf("Kelvin", "Celsius", "Fahrenheit", "Rankine"),
            "Kelvin"
        ),
        PracticeQuestion(
            "What is the term for the ability of a material to conduct heat?",
            listOf(
                "Thermal conductivity",
                "Thermal expansion",
                "Specific heat capacity",
                "Heat of fusion"
            ),
            "Thermal conductivity"
        ),
        PracticeQuestion(
            "What type of gas obeys the ideal gas law at all temperatures and pressures?",
            listOf("Real gas", "Perfect gas", "Noble gas", "Polyatomic gas"),
            "Perfect gas"
        ),
        PracticeQuestion(
            question = "What is thermal conductivity?",
            answers = listOf(
                "The rate at which heat flows through a material",
                "The ability of a material to resist heat flow",
                "The amount of heat required to raise the temperature of a material",
                "The amount of heat required to melt a material"
            ),
            answer = "The rate at which heat flows through a material"
        ),
        PracticeQuestion(
            question = "What is specific heat capacity?",
            answers = listOf(
                "The amount of heat required to raise the temperature of a material by 1 degree Celsius",
                "The rate at which heat flows through a material",
                "The ability of a material to resist heat flow",
                "The amount of heat required to melt a material"
            ),
            answer = "The amount of heat required to raise the temperature of a material by 1 degree Celsius"
        ),
        PracticeQuestion(
            question = "What is the ideal gas law?",
            answers = listOf(
                "PV=nRT",
                "PV=mRT",
                "P=V/nT",
                "P=nV/T"
            ),
            answer = "PV=nRT"
        ),
        PracticeQuestion(
            question = "What is Boyle's Law?",
            answers = listOf(
                "The volume of a gas is inversely proportional to its pressure at constant temperature",
                "The pressure of a gas is directly proportional to its volume at constant temperature",
                "The temperature of a gas is directly proportional to its volume at constant pressure",
                "The pressure of a gas is inversely proportional to its temperature at constant volume"
            ),
            answer = "The volume of a gas is inversely proportional to its pressure at constant temperature"
        ),
        PracticeQuestion(
            question = "What is Bernoulli's equation?",
            answers = listOf(
                "P + 1/2 * rho * v^2 + rho * g * h = constant",
                "P + rho * g * h = constant",
                "P + 1/2 * rho * v^2 = constant",
                "P + rho * v^2 = constant"
            ),
            answer = "P + 1/2 * rho * v^2 + rho * g * h = constant"
        ),
        PracticeQuestion(
            question = "What is Poiseuille's Law?",
            answers = listOf(
                "The volume flow rate of a fluid through a pipe is proportional to the fourth power of the radius of the pipe",
                "The pressure drop across a pipe is proportional to the length of the pipe",
                "The flow rate of a fluid through a pipe is proportional to the viscosity of the fluid",
                "The pressure drop across a pipe is inversely proportional to the viscosity of the fluid"
            ),
            answer = "The volume flow rate of a fluid through a pipe is proportional to the fourth power of the radius of the pipe"
        ),
        PracticeQuestion(
            question = "What is conduction?",
            answers = listOf(
                "The transfer of heat through a material without any movement of the material itself",
                "The transfer of heat due to the movement of a fluid",
                "The transfer of heat due to electromagnetic waves",
                "The transfer of heat due to collisions between particles"
            ),
            answer = "The transfer of heat through a material without any movement of the material itself"
        ),
        PracticeQuestion(
            question = "What is convection?",
            answers = listOf(
                "The transfer of heat due to the movement of a fluid",
                "The transfer of heat through a material without any movement of the material itself",
                "The transfer of heat due to electromagnetic waves",
                "The transfer of heat due to collisions between particles"
            ),
            answer = "The transfer of heat due to the movement of a fluid"
        ),
        PracticeQuestion(
            question = "What is radiation?",
            answers = listOf(
                "The transfer of heat due to electromagnetic waves",
                "The transfer of heat through a material without any movement of the material itself",
                "The transfer of heat due to the movement of a fluid",
                "The transfer of heat due to collisions between particles"
            ),
            answer = "The transfer of heat due to electromagnetic waves"
        ),


        )
    val aChemistry = listOf<PracticeQuestion>(
        PracticeQuestion(
            question = "What is the smallest unit of matter?",
            answers = listOf("Atom", "Molecule", "Compound", "Element"),
            answer = "Atom"
        ),
        PracticeQuestion(
            question = "What is the charge of a proton?",
            answers = listOf("Positive", "Negative", "Neutral", "Variable"),
            answer = "Positive"
        ),
        PracticeQuestion(
            question = "What type of bond is formed between two non-metals?",
            answers = listOf("Covalent", "Ionic", "Metallic", "Hydrogen"),
            answer = "Covalent"
        ),
        PracticeQuestion(
            question = "What is the molecular shape of CO2?",
            answers = listOf("Linear", "Trigonal Planar", "Tetrahedral", "Octahedral"),
            answer = "Linear"
        ),
        PracticeQuestion(
            question = "What is the heat absorbed or released during a chemical reaction called?",
            answers = listOf("Enthalpy", "Entropy", "Gibbs Free Energy", "Activation Energy"),
            answer = "Enthalpy"
        ),
        PracticeQuestion(
            question = "What is the process by which a substance is oxidized and reduced at the same time?",
            answers = listOf(
                "Redox Reaction",
                "Acid-Base Reaction",
                "Precipitation Reaction",
                "Complexation Reaction"
            ),
            answer = "Redox Reaction"
        ),
        PracticeQuestion(
            question = "What happens to the equilibrium constant when a system is heated?",
            answers = listOf(
                "May increase or decrease",
                "Remains constant",
                "Always increases",
                "Always decreases"
            ),
            answer = "May increase or decrease"
        ),
        PracticeQuestion(
            question = "What factor(s) can affect the rate of a chemical reaction?",
            answers = listOf("Concentration", "Temperature", "Catalyst", "All of the above"),
            answer = "All of the above"
        ), PracticeQuestion(
            "Which element in period 3 has the highest electronegativity?",
            listOf("Sodium", "Chlorine", "Argon", "Phosphorus"),
            "Chlorine"
        ),
        PracticeQuestion(
            "Which oxide is formed by the reaction of aluminum with oxygen?",
            listOf("Al2O3", "AlO", "AlO2", "Al2O"),
            "Al2O3"
        ),

        // Chemistry of Group II elements
        PracticeQuestion(
            "What is the general electronic configuration of group II elements?",
            listOf("ns^1", "ns^2", "np^1", "np^2"),
            "ns^2"
        ),
        PracticeQuestion(
            "Which Group II element has the lowest melting point?",
            listOf("Magnesium", "Calcium", "Barium", "Beryllium"),
            "Magnesium"
        ),

        // Chemistry of Group IV elements
        PracticeQuestion(
            "What is the most common oxidation state for carbon?",
            listOf("-4", "-2", "+2", "+4"),
            "+4"
        ),
        PracticeQuestion(
            "Which isotope of silicon is most abundant in nature?",
            listOf("Si-28", "Si-29", "Si-30", "Si-31"),
            "Si-28"
        ),

        // Chemistry of Group VII elements
        PracticeQuestion(
            "Which halogen has the highest electron affinity?",
            listOf("Fluorine", "Chlorine", "Bromine", "Iodine"),
            "Fluorine"
        ),
        PracticeQuestion(
            "What is the oxidizing agent in the reaction of chlorine with potassium bromide?",
            listOf("KBr", "KClO", "Cl2", "KCl"),
            "Cl2"
        ),
        PracticeQuestion(
            "What is the general formula for alkanes?",
            listOf("CnH2n+2", "CnH2n", "CnH2n-2", "CnH2n-4"),
            "CnH2n+2"
        ),
        PracticeQuestion(
            "Which functional group is present in chloroform (CHCl3)?",
            listOf("halogen", "alcohol", "alkene", "aldehyde"),
            "halogen"
        ),
        PracticeQuestion(
            "What is the common name for ethyl alcohol?",
            listOf("methanol", "isopropyl alcohol", "ethyl acetate", "ethanol"),
            "ethanol"
        ),
        PracticeQuestion(
            "What is the functional group present in acetone?",
            listOf("ketone", "ester", "amide", "carboxylic acid"),
            "ketone"
        ),
        PracticeQuestion(
            "What is the product of the reaction between acetic acid and ethanol?",
            listOf("ethyl acetate", "acetaldehyde", "acetic anhydride", "acetonitrile"),
            "ethyl acetate"
        ),
        PracticeQuestion(
            "What is the functional group present in aniline?",
            listOf("amine", "amide", "nitrile", "nitro"),
            "amine"
        ),
        PracticeQuestion(
            "What type of polymerization occurs in the formation of polyethylene?",
            listOf("addition", "condensation", "elimination", "substitution"),
            "addition"
        ),
        PracticeQuestion(
            "What is the electronic configuration of copper?",
            listOf(
                "1s2 2s2 2p6 3s2 3p6 4s1 3d10",
                "1s2 2s2 2p6 3s2 3p6 4s2 3d9",
                "1s2 2s2 2p6 3s2 3p6 4s2 3d8",
                "1s2 2s2 2p6 3s2 3p6 4s2 3d10"
            ),
            "1s2 2s2 2p6 3s2 3p6 4s1 3d10"
        ),
        PracticeQuestion(
            "Which transition metal has the highest melting point?",
            listOf("Copper", "Iron", "Tungsten", "Titanium"),
            "Tungsten"
        ),
        PracticeQuestion(
            "What is the chemical formula for ozone?",
            listOf("O2", "O3", "CO2", "SO2"),
            "O3"
        ),
        PracticeQuestion(
            "What is the primary cause of acid rain?",
            listOf(
                "Carbon dioxide emissions",
                "Nitrogen oxide emissions",
                "Sulfur dioxide emissions",
                "Methane emissions"
            ),
            "Sulfur dioxide emissions"
        ),
        PracticeQuestion(
            "What is the size range of nanoparticles in nanotechnology?",
            listOf("1-10 nm", "10-100 nm", "100-500 nm", "500-1000 nm"),
            "1-10 nm"
        ),
        PracticeQuestion(
            "Which compound is commonly known as laughing gas?",
            listOf("Nitrous oxide", "Nitric oxide", "Sulfur dioxide", "Carbon monoxide"),
            "Nitrous oxide"
        ),
        PracticeQuestion(
            "What is the most abundant gas in Earth's atmosphere?",
            listOf("Oxygen", "Nitrogen", "Carbon dioxide", "Argon"),
            "Nitrogen"
        ),
        PracticeQuestion(
            "Which is the most stable allotrope of sulfur?",
            listOf("Rhombic sulfur", "Monoclinic sulfur", "Amorphous sulfur", "Plastic sulfur"),
            "Rhombic sulfur"
        )


    )
    val aAccounting = listOf<PracticeQuestion>(

        PracticeQuestion(
            "What is the purpose of cost-volume-profit analysis?",
            listOf("To determine breakeven point", "To calculate net present value", "To analyze balance sheet", "To prepare income statement"),
            "To determine breakeven point"
        ),
        PracticeQuestion(
            "What is absorption costing?",
            listOf("A method of allocating all manufacturing costs to products", "A type of variable costing", "A technique used in job-order costing", "A way of calculating indirect costs"),
            "A method of allocating all manufacturing costs to products"
        ),
        PracticeQuestion(
            "What is relevant costing?",
            listOf("A decision-making tool that involves analyzing only the costs and benefits that will change with a specific decision", "A type of historical costing", "A way of calculating sunk costs", "A method of allocating fixed overhead costs"),
            "A decision-making tool that involves analyzing only the costs and benefits that will change with a specific decision"
        ),
        PracticeQuestion(
            "How does activity-based costing differ from traditional costing methods?",
            listOf("It assigns overhead costs to products based on their use of activities", "It allocates overhead costs based on direct labor hours", "It ignores fixed costs", "It is only used for service-based businesses"),
            "It assigns overhead costs to products based on their use of activities"
        ),
        PracticeQuestion(
            "What is a budget variance?",
            listOf("The difference between actual results and budgeted amounts", "The amount of money set aside for emergencies", "The excess revenue generated by a project", "The total cost of a project"),
            "The difference between actual results and budgeted amounts"
        ),
        PracticeQuestion(
            "What is a flexible budget?",
            listOf("A budget that adjusts for changes in activity levels", "A budget that remains fixed regardless of activity levels", "A budget that only includes variable costs", "A budget that only includes fixed costs"),
            "A budget that adjusts for changes in activity levels"
        ),
        PracticeQuestion(
            "What is a standard cost?",
            listOf("A predetermined cost for a unit of product or service", "The actual cost incurred to produce a unit of product or service", "The total cost of producing a batch of products", "The cost of materials used in production"),
            "A predetermined cost for a unit of product or service"
        ),
        PracticeQuestion(
            "What is throughput accounting?",
            listOf("A management accounting technique that focuses on increasing the rate at which products move through the production process", "A method of allocating overhead costs based on machine hours", "A way of calculating net present value", "A type of absorption costing"),
            "A management accounting technique that focuses on increasing the rate at which products move through the production process"
        ),
        PracticeQuestion(
            "What is a master budget?",
            listOf("An overall budget that includes all other budgets", "A budget that only includes variable costs", "A budget that only includes fixed costs", "A budget that adjusts for changes in activity levels"),
            "An overall budget that includes all other budgets"
        ),
        PracticeQuestion(
            "What is a responsibility center?",
            listOf("A subunit within an organization whose manager is accountable for specified activities", "The department responsible for accounting and finance", "The area of an organization responsible for human resources", "The sales team"),
            "A subunit within an organization whose manager is accountable for specified activities"
        )
        ,
        PracticeQuestion(
            "What is the purpose of financial reporting?",
            listOf("To provide information about an organization's financial performance", "To forecast future revenues and expenses", "To create budgets and allocate resources", "To manage internal controls"),
            "To provide information about an organization's financial performance"
        ),
        PracticeQuestion(
            "What is the difference between a balance sheet and an income statement?",
            listOf("A balance sheet shows a company's financial position at a specific point in time, while an income statement shows its financial performance over a period of time", "An income statement shows a company's assets, liabilities, and equity, while a balance sheet shows its revenues and expenses", "A balance sheet shows a company's revenues and expenses, while an income statement shows its cash flows", "An income statement shows a company's net income, while a balance sheet shows its gross income"),
            "A balance sheet shows a company's financial position at a specific point in time, while an income statement shows its financial performance over a period of time"
        ),
        PracticeQuestion(
            "What is GAAP?",
            listOf("Generally Accepted Accounting Principles", "Good Accounting and Auditing Practices", "Global Accounting and Auditing Procedures", "Governmental Accounting and Auditing Policies"),
            "Generally Accepted Accounting Principles"
        ),
        PracticeQuestion(
            "What is the purpose of the statement of cash flows?",
            listOf("To show how changes in balance sheet accounts and income affect cash and cash equivalents", "To report on a company's overall financial health", "To summarize a company's revenue and expenses", "To disclose information about a company's investments and financing activities"),
            "To show how changes in balance sheet accounts and income affect cash and cash equivalents"
        ),
        PracticeQuestion(
            "What is the difference between a cash basis and accrual basis of accounting?",
            listOf("The cash basis records revenue and expenses when cash is received or paid, while the accrual basis records revenue and expenses when they are earned or incurred", "The cash basis records revenue and expenses when they are earned or incurred, while the accrual basis records revenue and expenses when cash is received or paid", "The cash basis records only cash transactions, while the accrual basis records all types of transactions", "The cash basis uses double-entry accounting, while the accrual basis uses single-entry accounting"),
            "The cash basis records revenue and expenses when cash is received or paid, while the accrual basis records revenue and expenses when they are earned or incurred"
        ),
        PracticeQuestion(
            "What is a footnote in financial statements?",
            listOf("Additional information that provides context for the numbers presented in the financial statements", "A summary of all the financial statements", "A report on the auditor's findings", "A description of the company's management structure"),
            "Additional information that provides context for the numbers presented in the financial statements"
        ),
        PracticeQuestion(
            "What is the purpose of an auditor's report?",
            listOf("To provide an independent opinion on the fairness of the financial statements", "To identify errors and discrepancies in the financial statements", "To make recommendations for improving the company's financial performance", "To certify the accuracy of the financial statements"),
            "To provide an independent opinion on the fairness of the financial statements"
        ),
        PracticeQuestion(
            "What is the difference between a qualified and unqualified auditor's report?",
            listOf("An unqualified report indicates that the financial statements are free from material misstatement, while a qualified report indicates that there are some issues with the financial statements", "A qualified report indicates that the auditor found no issues with the financial statements, while an unqualified report indicates that there are some issues", "An unqualified report indicates that the auditor found no issues with the financial statements, while a qualified report indicates that there may be errors in the financial statements", "A qualified report indicates that the auditor is not able to provide an opinion on the financial statements, while an unqualified report provides a clean bill of health"),
            "An unqualified report indicates that the financial statements are free from material misstatement, while a qualified report indicates that there are some issues with the financial statements"
        ),
        PracticeQuestion(
            "What is the accounting equation?",
            listOf("Assets = Liabilities + Equity", "Revenue - Expenses = Net Income", "Debits = Credits", "Gross Profit - Operating Expenses = Net Income"),
            "Assets = Liabilities + Equity"
        ),
        PracticeQuestion(
            "What is the difference between an asset and a liability?",
            listOf("An asset is something owned by a company, while a liability is something owed by a company", "An asset is money in the bank, while a liability is money owed to the bank", "An asset is a revenue-generating activity, while a liability is an expense incurred by the company", "An asset is a long-term investment, while a liability is a short-term debt"),
            "An asset is something owned by a company, while a liability is something owed by a company"
        ),
        PracticeQuestion(
            "What is the purpose of financial statements?",
            listOf("To provide information about a company's financial position, performance, and cash flows", "To track employee payroll and benefits", "To calculate taxes owed to the government", "To report on corporate social responsibility activities"),
            "To provide information about a company's financial position, performance, and cash flows"
        ),
        PracticeQuestion(
            "What is the difference between a debit and a credit?",
            listOf("A debit increases assets and decreases liabilities, while a credit does the opposite", "A debit decreases assets and increases liabilities, while a credit does the opposite", "A debit always increases equity, while a credit always decreases equity", "A debit always decreases equity, while a credit always increases equity"),
            "A debit increases assets and decreases liabilities, while a credit does the opposite"
        ),
        PracticeQuestion(
            "What is the difference between gross profit and net income?",
            listOf("Gross profit is revenue minus cost of goods sold, while net income is revenue minus all expenses", "Gross profit is revenue minus operating expenses, while net income is revenue minus cost of goods sold", "Gross profit is revenue minus taxes, while net income is revenue minus interest expense", "Gross profit is revenue minus selling and administrative expenses, while net income is revenue minus payroll expenses"),
            "Gross profit is revenue minus cost of goods sold, while net income is revenue minus all expenses"
        ),
        PracticeQuestion(
            "What is FIFO?",
            listOf("First-In, First-Out; a method of inventory valuation", "Financial Information Force Order; a regulatory requirement for public companies", "Fixed Income Fund Objective; an investment strategy", "Flexible Internal Financial Operations; a management technique"),
            "First-In, First-Out; a method of inventory valuation"
        ),
        PracticeQuestion(
            "What is the difference between accounts receivable and accounts payable?",
            listOf("Accounts receivable are amounts owed to a company by customers, while accounts payable are amounts owed by a company to vendors", "Accounts receivable are cash on hand, while accounts payable are short-term investments", "Accounts receivable are long-term debts, while accounts payable are short-term debts", "Accounts receivable are recorded as credits, while accounts payable are recorded as debits"),
            "Accounts receivable are amounts owed to a company by customers, while accounts payable are amounts owed by a company to vendors"
        ),
        PracticeQuestion(
            "What is the purpose of a trial balance?",
            listOf("To ensure that debits equal credits in the general ledger", "To provide information about the overall financial health of a company", "To calculate depreciation expense", "To reconcile bank statements with the general ledger"),
            "To ensure that debits equal credits in the general ledger"
        ),
        PracticeQuestion(
            "What is the difference between a long-term and short-term asset?",
            listOf("A long-term asset has a useful life greater than one year, while a short-term asset has a useful life of one year or less", "A long-term asset generates revenue, while a short-term asset does not", "A long-term asset can be easily converted to cash, while a short-term asset cannot", "A long-term asset is recorded as a debit, while a short-term asset is recorded as a credit"),
            "A long-term asset has a useful life greater than one year, while a short-term asset has a useful life of one year or less"
        ),
        PracticeQuestion(
            "What is cost accounting?",
            listOf("A process of recording and analyzing all costs incurred in the production of goods or services", "A method of preparing financial statements for external users", "A tool used to forecast revenue", "A system used to manage employee salaries and benefits"),
            "A process of recording and analyzing all costs incurred in the production of goods or services"
        ),
        PracticeQuestion(
            "What are direct costs?",
            listOf("Costs that can be easily traced to a specific product or service", "Indirect costs that cannot be traced to a specific product or service", "Fixed costs that do not vary with production volume", "Variable costs that change with production volume"),
            "Costs that can be easily traced to a specific product or service"
        ),
        PracticeQuestion(
            "What is absorption costing?",
            listOf("A costing method that includes both fixed and variable manufacturing costs", "A costing method that only includes variable manufacturing costs", "A costing method that only includes direct manufacturing costs", "A costing method that only includes indirect manufacturing costs"),
            "A costing method that includes both fixed and variable manufacturing costs"
        ),
        PracticeQuestion(
            "What is target costing?",
            listOf("A costing method that sets a desired price and works backwards to determine the maximum cost to produce the product", "A costing method that sets prices based on what customers are willing to pay", "A costing method that only includes direct costs", "A costing method that only applies to service companies"),
            "A costing method that sets a desired price and works backwards to determine the maximum cost to produce the product"
        ),
        PracticeQuestion(
            "What is a cost driver?",
            listOf("An activity that causes costs to change", "A direct cost that can be easily traced to a specific product or service", "An indirect cost that cannot be traced to a specific product or service", "A fixed cost that does not vary with production volume"),
            "An activity that causes costs to change"
        ),
        PracticeQuestion(
            "What are variable costs?",
            listOf("Costs that change with production volume", "Costs that do not change with production volume", "Costs that can be easily traced to a specific product or service", "Indirect costs that cannot be traced to a specific product or service"),
            "Costs that change with production volume"
        ),
        PracticeQuestion(
            "How do you calculate the contribution margin?",
            listOf("Sales revenue minus variable costs", "Direct materials plus direct labor", "Fixed costs divided by contribution margin per unit", "Sales revenue minus gross profit"),
            "Sales revenue minus variable costs"
        ),
        PracticeQuestion(
            "What is a standard cost?",
            listOf("A predetermined cost per unit of product", "The actual cost incurred in producing a product or service", "The average cost of all products or services produced by a company", "The maximum cost that a company can incur in producing a product or service"),
            "A predetermined cost per unit of product"
        ),
        PracticeQuestion(
            "What is a break-even point?",
            listOf("The point at which total revenue equals total cost", "The point at which fixed costs are fully recovered", "The point at which variable costs equal fixed costs", "None of the above"),
            "The point at which total revenue equals total cost"
        ),
        PracticeQuestion(
            "What is variance analysis?",
            listOf("Comparing actual costs to budgeted costs", "Increasing advertising spending", "Implementing an employee recognition program", "Hiring more employees"),
            "Comparing actual costs to budgeted costs"
        )
    )
    val aBiology = listOf<PracticeQuestion>(
        PracticeQuestion(
            "What is the main function of the cell membrane?",
            listOf(
                "To regulate the movement of materials in and out of the cell",
                "To provide structural support to the cell",
                "To store genetic material",
                "To synthesize proteins"
            ),
            "To regulate the movement of materials in and out of the cell"
        ),
        PracticeQuestion(
            "Which of the following is NOT a biological molecule?",
            listOf("Lipids", "Carbohydrates", "Water", "Nucleic acids"),
            "Water"
        ),
        PracticeQuestion(
            "What is the process by which a cell divides into two daughter cells?",
            listOf("Mitosis", "Meiosis", "Transcription", "Translation"),
            "Mitosis"
        ),
        PracticeQuestion(
            "What is the function of ribosomes in a cell?",
            listOf(
                "To synthesize proteins",
                "To produce ATP",
                "To provide structural support",
                "To store genetic material"
            ),
            "To synthesize proteins"
        ),
        PracticeQuestion(
            "Which of the following is a carbohydrate?",
            listOf("Glucose", "Cholesterol", "Phospholipid", "Hormone"),
            "Glucose"
        ),
        PracticeQuestion(
            "During which stage of the cell cycle does DNA replication occur?",
            listOf("S phase", "G1 phase", "G2 phase", "M phase"),
            "S phase"
        ),
        PracticeQuestion(
            "What is the function of the nucleolus?",
            listOf(
                "To produce ribosomes",
                "To store genetic material",
                "To regulate cell growth and division",
                "To synthesize lipids"
            ),
            "To produce ribosomes"
        ),
        PracticeQuestion(
            "Which of the following is a function of proteins in a cell?",
            listOf(
                "Catalyzing chemical reactions",
                "Storing genetic information",
                "Providing energy for the cell",
                "Regulating osmosis"
            ),
            "Catalyzing chemical reactions"
        ),
        PracticeQuestion(
            "What is the role of enzymes in biological reactions?",
            listOf(
                "To increase the rate of reaction",
                "To decrease the rate of reaction",
                "To stabilize the reactants",
                "To provide energy for the reaction"
            ),
            "To increase the rate of reaction"
        ),
        PracticeQuestion(
            question = "What is the main advantage of sexual reproduction?",
            answers = listOf(
                "Genetic variation in offspring",
                "Increased population size",
                "Better adaptation to environment",
                "Lower energy cost"
            ),
            answer = "Genetic variation in offspring"
        ),
        PracticeQuestion(
            question = "What is the name of the female reproductive cell?",
            answers = listOf(
                "Ovum",
                "Sperm",
                "Zygote",
                "Embryo"
            ),
            answer = "Ovum"
        ),
        PracticeQuestion(
            question = "What is gametogenesis?",
            answers = listOf(
                "The process of producing gametes",
                "The fusion of gametes to form a zygote",
                "The development of the placenta",
                "The exchange of gases during respiration"
            ),
            answer = "The process of producing gametes"
        ),
        PracticeQuestion(
            "What is a gene mutation?",
            listOf(
                "A change in the DNA sequence",
                "An alteration in the structure of a chromosome",
                "A modification of the genetic code",
                "A shift in the frequency of an allele"
            ),
            "A change in the DNA sequence"
        ),
        PracticeQuestion(
            "What is a restriction enzyme?",
            listOf(
                "An enzyme that cuts DNA at specific recognition sites",
                "An enzyme that repairs damaged DNA",
                "An enzyme that synthesizes new DNA strands",
                "An enzyme that regulates gene expression"
            ),
            "An enzyme that cuts DNA at specific recognition sites"
        ),
        PracticeQuestion(
            "What is natural selection?",
            listOf(
                "The process by which individuals with favorable traits are more likely to survive and reproduce",
                "The transfer of genetic material from one generation to the next",
                "The random distribution of alleles in a population",
                "The creation of new species through hybridization"
            ),
            "The process by which individuals with favorable traits are more likely to survive and reproduce"
        ),
        PracticeQuestion(
            "What is a transgenic organism?",
            listOf(
                "An organism that has been genetically modified by inserting DNA from another species",
                "An organism that has been selectively bred for specific traits",
                "An organism that has undergone radiation or chemical mutagenesis",
                "An organism that has lost function in a particular gene"
            ),
            "An organism that has been genetically modified by inserting DNA from another species"
        ),
        PracticeQuestion(
            "What is epigenetic inheritance?",
            listOf(
                "The transmission of information from one generation to the next via chemical modifications of DNA and histones",
                "The exchange of genetic material between homologous chromosomes during meiosis",
                "The formation of new combinations of alleles through crossing over",
                "The random distribution of chromosomes into gametes"
            ),
            "The transmission of information from one generation to the next via chemical modifications of DNA and histones"
        ),
        PracticeQuestion(
            "What is genetic drift?",
            listOf(
                "The random fluctuation of allele frequencies in a population",
                "The movement of individuals from one population to another",
                "The transfer of genes from one chromosome to another",
                "The selective breeding of individuals with desired traits"
            ),
            "The random fluctuation of allele frequencies in a population"
        ),
        PracticeQuestion(
            "What is gene editing?",
            listOf(
                "A technique used to modify DNA sequences",
                "The implantation of foreign genes into an organism",
                "The removal of entire genes from an organism",
                "The synthesis of new DNA strands"
            ),
            "A technique used to modify DNA sequences"
        ),
        PracticeQuestion(
            "What is a GMO?",
            listOf(
                "An organism that has been genetically modified using biotechnology",
                "An organism that has undergone natural selection",
                "An organism that has been exposed to radiation or chemicals",
                "An organism that has lost function in a particular gene"
            ),
            "An organism that has been genetically modified using biotechnology"
        ),
        PracticeQuestion(
            "What is convergent evolution?",
            listOf(
                "The independent evolution of similar features in different lineages",
                "The convergence of two different species into a single hybrid species",
                "The divergence of a single species into multiple distinct species",
                "The evolution of a trait in response to sexual selection"
            ),
            "The independent evolution of similar features in different lineages"
        ),

        // Ecology
        PracticeQuestion(
            question = "What is an ecosystem?",
            answers = listOf(
                "A community of living and non-living things",
                "A group of species that live together",
                "A system of nutrient cycling",
                "A type of biome"
            ),
            answer = "A community of living and non-living things"
        ),
        PracticeQuestion(
            question = "What is the greenhouse effect?",
            answers = listOf(
                "The trapping of heat by gases in the atmosphere",
                "The warming of the Earth's surface by the sun",
                "The cooling of the Earth's surface by trees",
                "The reflection of light by ice caps"
            ),
            answer = "The trapping of heat by gases in the atmosphere"
        ),
        PracticeQuestion(
            question = "What is a keystone species?",
            answers = listOf(
                "A species that has a disproportionately large effect on its ecosystem",
                "A type of predator that feeds on other predators",
                "A type of plant that is used for medicinal purposes",
                "A species that is only found in one specific location"
            ),
            answer = "A species that has a disproportionately large effect on its ecosystem"
        ),

        // Biodiversity
        PracticeQuestion(
            question = "What is biodiversity?",
            answers = listOf(
                "The variety of life in an ecosystem",
                "The total number of organisms in an ecosystem",
                "The number of different habitats in an ecosystem",
                "The amount of genetic variation in an ecosystem"
            ),
            answer = "The variety of life in an ecosystem"
        ),
        PracticeQuestion(
            question = "What is an invasive species?",
            answers = listOf(
                "A non-native species that causes harm to the environment",
                "A native species that is endangered",
                "A species that is important for ecosystem function",
                "A species that only lives in one specific area"
            ),
            answer = "A non-native species that causes harm to the environment"
        ),
        PracticeQuestion(
            question = "What is the main cause of habitat destruction?",
            answers = listOf(
                "Human activity",
                "Climate change",
                "Natural disasters",
                "Overhunting by predators"
            ),
            answer = "Human activity"
        ),

        // Human Health and Disease
        PracticeQuestion(
            question = "What is a pathogen?",
            answers = listOf(
                "A disease-causing organism",
                "A type of antibiotic",
                "A type of vaccine",
                "A type of immune cell"
            ),
            answer = "A disease-causing organism"
        ),
        PracticeQuestion(
            question = "What is the difference between a virus and bacteria?",
            answers = listOf(
                "Bacteria are cells while viruses are not",
                "Viruses can reproduce on their own while bacteria cannot",
                "Bacteria cause more severe diseases than viruses",
                "Viruses are treated with antibiotics while bacteria are not"
            ),
            answer = "Bacteria are cells while viruses are not"
        ),
        PracticeQuestion(
            question = "What is herd immunity?",
            answers = listOf(
                "When a large portion of a population becomes immune to a disease, providing indirect protection for those who are not immune",
                "The natural resistance of an individual to a disease",
                "The process of vaccinating a large group of people at once",
                "The level of immunity that is acquired through exposure to a pathogen"
            ),
            answer = "When a large portion of a population becomes immune to a disease, providing indirect protection for those who are not immune"
        ),

        PracticeQuestion(
            "What is the main energy source for cellular respiration?",
            listOf("Glucose", "Fructose", "Sucrose", "Galactose"),
            "Glucose"
        ),
        PracticeQuestion(
            "What is the difference between aerobic and anaerobic respiration?",
            listOf(
                "Aerobic requires oxygen, anaerobic does not",
                "Aerobic produces more ATP than anaerobic",
                "Anaerobic occurs in the mitochondria, aerobic occurs in the cytoplasm",
                "Aerobic produces lactic acid as a waste product"
            ),
            "Aerobic requires oxygen, anaerobic does not"
        ),
        PracticeQuestion(
            "What is the role of ATP in cellular metabolism?",
            listOf(
                "It stores energy for later use",
                "It releases energy for use by cells",
                "It provides structural support to cells",
                "It eliminates waste products from cells"
            ),
            "It releases energy for use by cells"
        ),
        PracticeQuestion(
            "What is the role of red blood cells in the circulatory system?",
            listOf("Oxygen transport", "Nutrient absorption", "Waste removal", "Hormone production"),
            "Oxygen transport"
        ),
        PracticeQuestion(
            "What is the function of valves in veins?",
            listOf(
                "To prevent backflow of blood",
                "To regulate blood pressure",
                "To increase oxygen saturation of blood",
                "To filter out waste products"
            ),
            "To prevent backflow of blood"
        ),
        PracticeQuestion(
            "What effect does epinephrine have on blood vessels?",
            listOf("Constricts them", "Dilates them", "Has no effect", "Causes them to leak"),
            "Dilates them"
        ),
        PracticeQuestion(
            "Which type of neuron transmits signals from sensory receptors to the central nervous system?",
            listOf("Sensory neurons", "Motor neurons", "Interneurons", "Glial cells"),
            "Sensory neurons"
        ),
        PracticeQuestion(
            "What is the function of the medulla oblongata?",
            listOf(
                "Regulates heart rate and breathing",
                "Processes visual information",
                "Controls balance and coordination",
                "Regulates body temperature"
            ),
            "Regulates heart rate and breathing"
        ),
        PracticeQuestion(
            "What is the difference between the sympathetic and parasympathetic nervous systems?",
            listOf(
                "Sympathetic controls voluntary actions, parasympathetic controls involuntary actions",
                "Sympathetic regulates rest and digest functions, parasympathetic regulates fight or flight response",
                "Sympathetic increases heart rate and blood pressure, parasympathetic decreases them",
                "There is no difference"
            ),
            "Sympathetic increases heart rate and blood pressure, parasympathetic decreases them"
        )


    )
    val aGeography = listOf<PracticeQuestion>(

        PracticeQuestion(
            "What is the primary use of Geographic Information Systems (GIS)?",
            listOf("To create maps", "To analyze and manage data", "To study climate change", "To predict earthquakes"),
            "To analyze and manage data"
        ),
        PracticeQuestion(
            "Which remote sensing technology is used to measure ocean temperature?",
            listOf("LiDAR", "RADAR", "SONAR", "Infrared"),
            "Infrared"
        ),
        PracticeQuestion(
            "What is geostatistical analysis?",
            listOf("The analysis of geographic data", "Statistical analysis of geological data", "Analysis of spatial patterns", "Analysis of demographic data"),
            "Analysis of spatial patterns"
        ),
        PracticeQuestion(
            "What kind of presentation can be created using geostatistical analysis?",
            listOf("Pie chart", "Scatter plot", "Heat map", "Bar graph"),
            "Heat map"
        ),
        PracticeQuestion(
            "What is environmental management?",
            listOf("The management of natural resources", "The management of finances", "The management of human resources", "The management of information systems"),
            "The management of natural resources"
        ),
        PracticeQuestion(
            "What are some common goals of environmental management?",
            listOf("Conservation, restoration, and sustainable use", "Profitability, market share, and growth", "Efficiency, productivity, and quality", "Innovation, creativity, and collaboration"),
            "Conservation, restoration, and sustainable use"
        )
        ,
        PracticeQuestion(
            "What is geomorphology?",
            listOf("The study of the oceans", "The study of the Earth's crust", "The study of landforms and their evolution", "The study of climate patterns"),
            "The study of landforms and their evolution"
        ),
        PracticeQuestion(
            "Which type of rock is most commonly associated with mountains?",
            listOf("Igneous", "Sedimentary", "Metamorphic", "None of the above"),
            "Metamorphic"
        ),
        PracticeQuestion(
            "What is the primary factor that drives settlement dynamics?",
            listOf("Climate", "Political stability", "Economic opportunities", "Natural disasters"),
            "Economic opportunities"
        ),
        PracticeQuestion(
            "What is urbanization?",
            listOf("The process of rural development", "The process of creating new cities", "The process of population growth in urban areas", "The process of rural-to-urban migration"),
            "The process of population growth in urban areas"
        ),
        PracticeQuestion(
            "What is population density?",
            listOf("The total number of people in an area", "The rate at which the population is growing", "The number of people per unit of area", "The average age of the population"),
            "The number of people per unit of area"
        ),
        PracticeQuestion(
            "What is migration?",
            listOf("The movement of people from one place to another", "The movement of goods from one place to another", "The movement of animals from one place to another", "The movement of ideas from one place to another"),
            "The movement of people from one place to another"
        ),
        PracticeQuestion(
            "What is agricultural production?",
            listOf("The process of farming", "The process of manufacturing food products", "The process of marketing food products", "The process of distributing food products"),
            "The process of farming"
        ),
        PracticeQuestion(
            "What is food security?",
            listOf("The ability to access safe and nutritious food at all times", "The ability to produce enough food to meet demand", "The ability to export food to other countries", "The ability to regulate the price of food"),
            "The ability to access safe and nutritious food at all times"
        ),
        PracticeQuestion(
            "What is industrial dynamics?",
            listOf("The study of how industries change over time", "The study of the interaction between industries", "The study of the impact of industry on the environment", "The study of the history of industry"),
            "The study of how industries change over time"
        ),
        PracticeQuestion(
            "What is outsourcing?",
            listOf("The process of relocating a business to another country", "The process of hiring workers from another country", "The process of moving jobs to another company", "The process of selling a business to another company"),
            "The process of hiring workers from another country"
        ),
        PracticeQuestion(
            "What is mining?",
            listOf("The extraction of valuable minerals or other geological materials from the Earth", "The production of new minerals through chemical processes", "The exploration of new mineral deposits", "The analysis of minerals for research purposes"),
            "The extraction of valuable minerals or other geological materials from the Earth"
        ),
        PracticeQuestion(
            "What is mineral beneficiation?",
            listOf("The process of extracting minerals from ore", "The process of refining minerals to increase their value", "The process of transporting minerals to market", "The process of selling minerals to buyers"),
            "The process of refining minerals to increase their value"
        ),

        PracticeQuestion("What is the process by which water vapor turns into liquid water?", listOf("Condensation", "Evaporation", "Precipitation", "Transpiration"), "Condensation"),
        PracticeQuestion("What term describes the study of the distribution and interaction of living organisms on Earth?", listOf("Biogeography", "Ecology", "Zoology", "Botany"), "Biogeography"),
        PracticeQuestion("What type of river channel has a steep gradient and is prone to intense flooding?", listOf("Braided channel", "Meandering channel", "Straight channel", "Anastomosing channel"), "Braided channel"),
        PracticeQuestion("What is the term for the transfer of heat by the movement of a fluid?", listOf("Convection", "Conduction", "Radiation", "Absorption"), "Convection"),
        PracticeQuestion("Which process describes the movement of water through plant roots and stems, eventually evaporating from the leaves?", listOf("Transpiration", "Respiration", "Photosynthesis", "Conduction"), "Transpiration"),
        PracticeQuestion("What atmospheric layer is closest to the Earth's surface?", listOf("Troposphere", "Stratosphere", "Mesosphere", "Thermosphere"), "Troposphere"),
        PracticeQuestion("What type of precipitation occurs when raindrops freeze before reaching the ground?", listOf("Sleet", "Hail", "Snow", "Freezing rain"), "Sleet"),
        PracticeQuestion("What term describes the process by which soluble substances are carried away from their source area by water?", listOf("Leaching", "Erosion", "Weathering", "Deposition"), "Leaching"),
        PracticeQuestion("What biogeographical region is characterized by cold temperatures, permafrost, and little vegetation?", listOf("Tundra", "Desert", "Rainforest", "Grassland"), "Tundra")
        ,
        PracticeQuestion(
            "What are the different forms of energy sources?",
            listOf("Fossil fuels", "Renewable energy", "Nuclear power", "Hydroelectric power"),
            "Renewable energy"
        ),
        PracticeQuestion(
            "What is the main mode of transportation for international trade?",
            listOf("Air transport", "Water transport", "Road transport", "Railway transport"),
            "Water transport"
        ),
        PracticeQuestion(
            "What is the term used to describe the uneven distribution of resources and opportunities between different regions?",
            listOf("Globalization", "Gentrification", "Regionalism", "Spatial inequality"),
            "Spatial inequality"
        ),
        PracticeQuestion(
            "Which energy source is the most polluting?",
            listOf("Nuclear power", "Hydroelectric power", "Wind power", "Coal"),
            "Coal"
        ),
        PracticeQuestion(
            "What type of transport system uses pipelines to transport liquid or gas products?",
            listOf("Railway transport", "Water transport", "Air transport", "Pipelines transport"),
            "Pipelines transport"
        ),
        PracticeQuestion(
            "What is the term used to describe the process of improving economic and social wellbeing in a region or country?",
            listOf("Development", "Growth", "Sustainability", "Stagnation"),
            "Development"
        ),
        PracticeQuestion(
            "Which renewable energy source relies on the sun's energy?",
            listOf("Wind power", "Solar power", "Geothermal power", "Tidal power"),
            "Solar power"
        ),
        PracticeQuestion(
            "What is the term used to describe the movement of goods and services from one place to another?",
            listOf("Transportation", "Logistics", "Distribution", "Trade"),
            "Trade"
        ),
        PracticeQuestion(
            "What is the term used to describe the economic and political dominance of one region or country over another?",
            listOf("Colonialism", "Neocolonialism", "Imperialism", "Globalization"),
            "Neocolonialism"
        )


    )
    val aComputerScience = listOf<PracticeQuestion>(
        PracticeQuestion(
            "Discuss the advantages and disadvantages of using multi-core processors in parallel computing.",
            listOf(
                "Increases performance by executing multiple tasks simultaneously",
                "May reduce power consumption compared to single-core processors",
                "May require complex programming techniques to exploit parallelism",
                "May result in increased latency and decreased performance if not programmed well"
            ),
            "May result in increased latency and decreased performance if not programmed well"
        ),
        PracticeQuestion(
            "Describe the process of virtual memory management in operating systems, including page replacement algorithms and their trade-offs.",
            listOf(
                "Virtual memory allows programs to use more memory than physically available",
                "Page replacement algorithms decide which pages to swap between main memory and disk",
                "Trade-offs include minimizing page faults, reducing overhead, and balancing demand for resources",
                "Examples of page replacement algorithms include FIFO, LRU, and optimal"
            ),
            "Page replacement algorithms decide which pages to swap between main memory and disk"
        ),
        PracticeQuestion(
            "Compare and contrast various database models such as relational, hierarchical, network and object-oriented databases.",
            listOf(
                "Relational databases store data in tables and enforce relationships between them with constraints",
                "Hierarchical databases represent data as a tree structure with parent-child relationships",
                "Network databases allow records to have multiple parent and child records",
                "Object-oriented databases store objects and their attributes as units"
            ),
            "Relational databases store data in tables and enforce relationships between them with constraints"
        ),
        PracticeQuestion(
            "Explain how cryptography can be used to ensure confidentiality, integrity, and authenticity of data in communication networks.",
            listOf(
                "Cryptography uses algorithms to transform plaintext into ciphertext, which is unreadable without a key",
                "Confidentiality can be ensured by encrypting data before transmission",
                "Integrity can be ensured by using message authentication codes or digital signatures",
                "Authenticity can be ensured by using digital certificates and public key infrastructure"
            ),
            "Integrity can be ensured by using message authentication codes or digital signatures"
        ),
        PracticeQuestion(
            "Discuss the concept of distributed systems and the challenges faced in designing and implementing them.",
            listOf(
                "Distributed systems consist of multiple computers that communicate and coordinate their actions through messages",
                "Challenges include ensuring fault tolerance, managing concurrency, and ensuring consistency",
                "Other challenges include load balancing, security, and scalability",
                "Examples of distributed systems include Google File System, MapReduce, and Apache Hadoop"
            ),
            "Challenges include ensuring fault tolerance, managing concurrency, and ensuring consistency"
        ),
        PracticeQuestion(
            "Explain the principles behind machine learning algorithms such as decision trees, neural networks, and support vector machines.",
            listOf(
                "Machine learning algorithms use statistical techniques to learn patterns from data",
                "Decision trees recursively split the input space based on features and thresholds",
                "Neural networks consist of layers of interconnected nodes that perform weighted sums and nonlinear activations",
                "Support vector machines find the hyperplane that best separates the input space into classes"
            ),
            "Machine learning algorithms use statistical techniques to learn patterns from data"
        ),
        PracticeQuestion(
            "Discuss the principles behind concurrent programming and the techniques used to ensure synchronization and mutual exclusion in shared-memory systems.",
            listOf(
                "Concurrent programming involves multiple threads or processes executing concurrently",
                "Synchronization is necessary when multiple threads access shared resources",
                "Techniques include locks, semaphores, and monitors",
                "Mutual exclusion ensures that only one thread can access a shared resource at a time"
            ),
            "Synchronization is necessary when multiple threads access shared resources"
        ),
        PracticeQuestion("What is a cache?", listOf(
            "A small amount of fast memory used to temporarily hold data that a computer is likely to use again",
            "An input/output device used to enter data into a computer",
            "A type of malware that self-replicates and spreads throughout a computer network"
        ), "A small amount of fast memory used to temporarily hold data that a computer is likely to use again"),

        PracticeQuestion("What is pipelining in computer architecture?", listOf(
            "A technique for overlapping the execution of multiple instructions",
            "The process of transmitting data over a network",
            "A type of parallel processing used in supercomputers"
        ), "A technique for overlapping the execution of multiple instructions"),

        PracticeQuestion("What is ransomware?", listOf(
            "Malware that encrypts a victim's files and demands payment in exchange for the decryption key",
            "A spam message containing malicious links or attachments"
        ), "Malware that encrypts a victim's files and demands payment in exchange for the decryption key"),

        PracticeQuestion("What is social engineering?", listOf(
            "A type of cyber attack that exploits human psychology to manipulate people into divulging sensitive information",
            "A technique for optimizing computer programs",
            "A method for securely storing passwords"
        ), "A type of cyber attack that exploits human psychology to manipulate people into divulging sensitive information"),

        PracticeQuestion("What is a side-channel attack?", listOf(
            "An attack that uses indirect information to gain unauthorized access to a computer system",
            "A type of denial-of-service attack",
            "A type of phishing scam"
        ), "An attack that uses indirect information to gain unauthorized access to a computer system"),

        PracticeQuestion("What is a firewall?", listOf(
            "A network security system that monitors and controls incoming and outgoing network traffic",
            "A device used to backup computer data",
            "A program that detects and removes malware from a computer"
        ), "A network security system that monitors and controls incoming and outgoing network traffic"),
        PracticeQuestion("What is the difference between authentication and authorization?", listOf(
            "Authentication is the process of verifying a user's identity, while authorization is the process of granting or denying access to specific resources",
            "Authentication and authorization are two names for the same process",
            "Authorization is the process of verifying a user's identity and granting access to all resources",
            "Authentication and authorization are not necessary in modern computer systems"
        ), "Authentication is the process of verifying a user's identity, while authorization is the process of granting or denying access to specific resources"),

        PracticeQuestion("What is two-factor authentication?", listOf(
            "A security process in which a user provides two different authentication factors to verify their identity",
            "A method for optimizing computer programs",
            "A type of encryption algorithm",
            "A software tool used to detect and remove malware from a computer"
        ), "A security process in which a user provides two different authentication factors to verify their identity"),

        PracticeQuestion("What is a lambda function?", listOf(
            "A function that can be passed as an argument to another function",
            "A function that returns another function",
            "A function that takes no arguments",
            "A function that can only be used in object-oriented programming"
        ), "A function that can be passed as an argument to another function"),

        PracticeQuestion("What is a binary search algorithm?", listOf(
            "An algorithm for searching through an ordered list by repeatedly dividing it in half",
            "An algorithm for sorting a list of integers",
            "An algorithm for finding the shortest path between two nodes in a graph",
            "An algorithm for calculating the factorial of a number"
        ), "An algorithm for searching through an ordered list by repeatedly dividing it in half"),

        PracticeQuestion("What is a database index?", listOf(
            "A data structure that improves the speed of data retrieval operations on a database table",
            "A tool used for backing up and restoring databases",
            "A software program used for managing databases",
            "A type of database model"
        ), "A data structure that improves the speed of data retrieval operations on a database table"),

        PracticeQuestion("What is SQL injection?", listOf(
            "A type of cyber attack that exploits vulnerabilities in SQL databases",
            "A technique for optimizing SQL queries",
            "A method for encrypting SQL database files",
            "A type of database backup"
        ), "A type of cyber attack that exploits vulnerabilities in SQL databases"),

        PracticeQuestion("What is normalization in database design?", listOf(
            "The process of organizing data in a database to reduce duplication and improve efficiency",
            "The process of converting data from one format to another",
            "The process of optimizing a database for read-heavy workloads",
            "The process of securing a database against hacking attacks"
        ), "The process of organizing data in a database to reduce duplication and improve efficiency"),
        PracticeQuestion("What is cloud computing?", listOf(
            "The delivery of computing services, including servers, storage, databases, networking, software, analytics, and intelligence, over the internet",
            "A type of computer hardware",
            "A programming language for building web applications",
            "A type of database management system"
        ), "The delivery of computing services, including servers, storage, databases, networking, software, analytics, and intelligence, over the internet"),

        PracticeQuestion("What is a data warehouse?", listOf(
            "A large repository of data that is used for business intelligence purposes such as analytics or reporting",
            "A software tool for managing databases",
            "A type of database model",
            "A method for backing up and restoring databases"
        ), "A large repository of data that is used for business intelligence purposes such as analytics or reporting"),

        PracticeQuestion("What is data mining?", listOf(
            "The process of discovering patterns in large datasets using statistical and machine learning techniques",
            "A method for optimizing SQL queries",
            "A technique for encrypting data in a database",
            "A type of database backup"
        ), "The process of discovering patterns in large datasets using statistical and machine learning techniques"),

        PracticeQuestion("What is entrepreneurship?", listOf(
            "The process of starting and managing a new business venture",
            "A programming language for building web applications",
            "The process of securing a database against hacking attacks",
            "A type of cloud computing service"
        ), "The process of starting and managing a new business venture"),

        PracticeQuestion("What is a business plan?", listOf(
            "A written document that describes in detail how a new business is going to achieve its goals",
            "A type of database backup",
            "A software program used for managing databases",
            "A tool used for backing up and restoring databases"
        ), "A written document that describes in detail how a new business is going to achieve its goals"),

        PracticeQuestion("What is market research?", listOf(
            "The process of gathering information about a target market to understand its needs and preferences",
            "A method for encrypting data in a database",
            "A type of cloud computing service",
            "A programming language for building web applications"
        ), "The process of gathering information about a target market to understand its needs and preferences"),

        PracticeQuestion("What is sales forecasting?", listOf(
            "The process of estimating future sales for a business",
            "A type of database model",
            "A technique for optimizing SQL queries",
            "A method for backing up and restoring databases"
        ), "The process of estimating future sales for a business"),

        PracticeQuestion("What is a marketing strategy?", listOf(
            "A plan of action for promoting and selling a product or service",
            "A type of cloud computing service",
            "A software tool for managing databases",
            "A programming language for building web applications"
        ), "A plan of action for promoting and selling a product or service")

        ,PracticeQuestion(
            "What is the purpose of the planning phase in SDLC?",
            listOf("To identify project objectives", "To create a detailed project schedule", "To evaluate risks and constraints", "To estimate project costs"),
            "To identify project objectives"
        ),

        PracticeQuestion(
            "What is the primary goal of the design phase in SDLC?",
            listOf("To define system requirements", "To create system specifications", "To develop a testing plan", "To finalize the system architecture"),
            "To create system specifications"
        ),

        PracticeQuestion(
            "Which phase involves developing and testing the actual system?",
            listOf("Design", "Testing", "Implementation", "Maintenance"),
            "Implementation"
        ),

        PracticeQuestion(
            "What is the purpose of the maintenance phase in SDLC?",
            listOf("To fix errors and bugs", "To enhance system features", "To optimize system performance", "All of the above"),
            "All of the above"
        ),

        PracticeQuestion(
            "What is a data structure?",
            listOf("A method for storing and organizing data", "An algorithm for searching data", "A way to generate random numbers", "A programming language feature"),
            "A method for storing and organizing data"
        ),

        PracticeQuestion(
            "Which data structure is best suited for quickly finding the maximum value in a collection of data?",
            listOf("Array", "Linked List", "Stack", "Tree"),
            "Tree"
        ),

        PracticeQuestion(
            "What is the time complexity of binary search algorithm?",
            listOf("O(n)", "O(log n)", "O(n^2)", "O(1)"),
            "O(log n)"
        ),

        PracticeQuestion(
            "What is an example of a divide-and-conquer algorithm?",
            listOf("Bubble sort", "Merge sort", "Selection sort", "Insertion sort"),
            "Merge sort"
        )

        ,

// 5.1 Data Representation
        PracticeQuestion(
            "What is a byte?",
            listOf("8 bits", "16 bits", "32 bits", "64 bits"),
            "8 bits"
        ),
        PracticeQuestion(
            "What is hexadecimal?",
            listOf("A base-16 numbering system", "A base-2 numbering system", "A base-10 numbering system", "An encryption algorithm"),
            "A base-16 numbering system"
        ),
        PracticeQuestion(
            "What is ASCII?",
            listOf("A character encoding standard", "A programming language", "An operating system", "A hardware component"),
            "A character encoding standard"
        ),
        PracticeQuestion(
            "What is the IEEE 754 standard?",
            listOf("A standardized format for floating-point numbers", "A networking protocol", "A file storage format", "An encryption algorithm"),
            "A standardized format for floating-point numbers"
        ),

// 5.2 Networking
        PracticeQuestion(
            "What is an IP address?",
            listOf("A unique identifier for devices on a network", "A type of virus", "A type of firewall", "An internet browser"),
            "A unique identifier for devices on a network"
        ),
        PracticeQuestion(
            "What is a MAC address?",
            listOf("A unique identifier for network interfaces", "A type of computer processor", "A type of network cable", "A type of internet protocol"),
            "A unique identifier for network interfaces"
        ),
        PracticeQuestion(
            "What is DNS?",
            listOf("The Domain Name System", "A type of encryption algorithm", "A type of firewall", "A type of internet browser"),
            "The Domain Name System"
        ),
        PracticeQuestion(
            "What is TCP/IP?",
            listOf("A suite of networking protocols", "A programming language", "An operating system", "An encryption algorithm"),
            "A suite of networking protocols"
        )

    )
    val aMaths = listOf<PracticeQuestion>(
        PracticeQuestion(
            "What is the modulus of the complex number 3 - 4i?",
            listOf("5", "7", "25", "15"),
            "5"
        ),
        PracticeQuestion(
            "What is the argument of the complex number 2 + 2i?",
            listOf("π/4", "-π/4", "3π/4", "-3π/4"),
            "π/4"
        ),
        PracticeQuestion(
            "What is the product of (1 + 2i)(3 - i)?",
            listOf("-1 + 5i", "-5 + i", "1 + 7i", "7 - i"),
            "-1 + 5i"
        ),
        PracticeQuestion(
            "What is the complex conjugate of the number 4 - 3i?",
            listOf("4 + 3i", "3 - 4i", "3 + 4i", "4 - 3i"),
            "4 + 3i"
        ),
        PracticeQuestion(
            "What is the cube root of -27i?",
            listOf("3(cos(7π/6) + i sin(7π/6))", "3(cos(11π/6) + i sin(11π/6))", "3(cos(5π/6) + i sin(5π/6))", "3(cos(π/6) + i sin(π/6))"),
            "3(cos(7π/6) + i sin(7π/6))"
        ),
        PracticeQuestion(
            "What is the value of x in the equation 2x + 5 = 15?",
            listOf("2", "3", "5", "7"),
            "5"
        ),
        PracticeQuestion(
            "Simplify the expression (x^2 + 2x - 8) / (x - 2).",
            listOf("x+4", "x-4", "x+2", "x-2"),
            "x+4"
        ),
        PracticeQuestion(
            "Factorize the expression x^2 - 4x - 21.",
            listOf("(x-7)(x+3)", "(x+7)(x-3)", "(x-5)(x-2)", "(x+5)(x+2)"),
            "(x-7)(x+3)"
        ),
        PracticeQuestion(
            "Solve the inequality 3x + 7 > 16.",
            listOf("x > 3", "x > 3.3", "x > 3.6", "x > 4"),
            "x > 3"
        ),
        PracticeQuestion(
            "Find the slope of the line passing through the points (-2, 5) and (3, -4).",
            listOf("-1", "1", "-2", "2"),
            "-2"
        ),
        PracticeQuestion(
            "What is the area of a triangle with base length 6 cm and height 8 cm?",
            listOf("12 cm²", "24 cm²", "30 cm²", "48 cm²"),
            "24 cm²"
        ),
        PracticeQuestion(
            "Find the equation of the line passing through the point (2, 5) and perpendicular to the line y = 2x + 1.",
            listOf("y = (-1/2)x + 6", "y = (1/2)x + 3", "y = (-2)x + 9", "y = (2)x + 1"),
            "y = (-1/2)x + 6"
        ),
        PracticeQuestion(
            "Calculate the dot product of the vectors [2, -3] and [4, 5].",
            listOf("-2", "-7", "2", "7"),
            "-22"
        ),
        PracticeQuestion(
            "Find the equation of the circle with center (-3, 4) and radius 5.",
            listOf("(x+3)² + (y-4)² = 25", "(x-3)² + (y+4)² = 25", "(x+3)² + (y+4)² = 25", "(x-3)² + (y-4)² = 25"),
            "(x+3)² + (y-4)² = 25"
        ),
        PracticeQuestion(
            "A rectangular box has dimensions 6 cm by 8 cm by 10 cm. What is its volume?",
            listOf("240 cm³", "360 cm³", "480 cm³", "600 cm³"),
            "480 cm³"
        )
        ,
        PracticeQuestion(
            "What is the derivative of f(x) = x^2?",
            listOf("2x", "x^2", "3x^2", "cos(x)"),
            "2x"
        ),
        PracticeQuestion(
            "Find the limit of (x^3 - 8)/(x-2) as x approaches 2.",
            listOf("4", "6", "8", "10"),
            "12"
        ),
        PracticeQuestion(
            "What is the second derivative of y = sin(x)?",
            listOf("-sin(x)", "cos(x)", "-cos(x)", "-cos(x)"),
            "-cos(x)"
        ),
        PracticeQuestion(
            "Evaluate integral of ∫(x^2 + 1) dx from 0 to 2.",
            listOf("2.5", "4", "6", "7"),
            "10/3"
        ),
        PracticeQuestion(
            "What is the value of dy/dx if y = 3x^2 + 4x - 5 at x = 2?",
            listOf("20", "22", "24", "26"),
            "22"
        ),
        PracticeQuestion(
            "What is the numerical solution of the equation x^3 - 2x - 5 = 0 with initial guess x = 2?",
            listOf("1.44", "1.58", "1.73", "1.89"),
            "1.73"
        ),
        PracticeQuestion(
            "What is the value of f(1.5) using the forward difference formula for the data set {(-1, 3), (0, -2), (2, 4), (3, 7)}?",
            listOf("8.5", "9.5", "10.5", "11.5"),
            "10.5"
        ),
        PracticeQuestion(
            "What is the numerical value of the derivative of y = sin(x) at x = π/4 using the central difference formula with h = 0.1?",
            listOf("0.71", "0.73", "0.75", "0.77"),
            "0.71"
        ),
        PracticeQuestion(
            "Find the area under the curve y = x^2 + 2x + 1 from x = 0 to x = 3 using Simpson's rule with n = 4.",
            listOf("13.5", "14.0", "14.5", "15.0"),
            "14.0"
        ),
        PracticeQuestion(
            "What is the numerical value of the solution to the equation x^3 - 2x - 5 = 0 using the bisection method with a tolerance of 0.01 and initial guesses of a = 1 and b = 2?",
            listOf("1.72", "1.84", "1.96", "2.08"),
            "1.72"
        )
        ,
        PracticeQuestion(
            "What is the square of the complex number 3+4i?",
            listOf("-7+24i", "-8+15i", "-9+12i", "-10+7i"),
            "-7+24i"
        ),
        PracticeQuestion(
            "What is the argument of the complex number 1+i?",
            listOf("π/2", "π/4", "3π/4", "π"),
            "π/4"
        ),
        PracticeQuestion(
            "What is the magnitude of the complex number 3+4i?",
            listOf("5", "6", "7", "8"),
            "5"
        ),
        PracticeQuestion(
            "What is the product of the complex conjugate of 2+3i and the complex number 1-2i?",
            listOf("8+7i", "7-8i", "-8+7i", "-7-8i"),
            "8+7i"
        ),
        PracticeQuestion(
            "What is the value of (1+i)/(1-i)?",
            listOf("i", "1", "-i", "-1"),
            "i"
        ),
        PracticeQuestion(
            "What is the solution to the equation z^2 + 4z + 5 = 0 in the form a+bi?",
            listOf("-2+i", "-2-i", "-1+i", "-1-i"),
            "-2+i"
        ),
        PracticeQuestion(
            "What is the value of e^(πi/3)?",
            listOf("(√3/2) + i/2", "(√2/2) + i(√2/2)", "1/2 + i(√3/2)", "1/2 + i(√2/2)"),
            "(√3/2) + i/2"
        ),
        PracticeQuestion(
            "What is the complex conjugate of 3-2i?",
            listOf("3+2i", "-3+2i", "3-2i", "-3-2i"),
            "3+2i"
        ),
        PracticeQuestion(
            "What is the argument of the complex number -2+2i?",
            listOf("π/4", "3π/4", "5π/4", "7π/4"),
            "3π/4"
        ),
        PracticeQuestion(
            "What is the value of (1+2i)^(1/3)?",
            listOf("1.21+0.38i", "1.08+0.27i", "1.34+0.42i", "1.47+0.46i"),
            "1.21+0.38i"
        ),
        PracticeQuestion("What is the sum of the first 10 terms of the arithmetic sequence: 4, 7, 10, ...?",
            listOf("140", "100", "110", "120"), "70"),
        PracticeQuestion("What is the nth term of the geometric sequence with first term 5 and common ratio 3?",
            listOf("5(3^(n-1))", "5(n^3)", "15(3^(n-1))", "(5/3)(3^n)"), "5(3^(n-1))"),
        PracticeQuestion("What is the sum of the infinite geometric series with first term 5 and common ratio 1/2?",
            listOf("10", "15", "20", "25"), "10"),
        PracticeQuestion("What is the sum of the first 7 terms of the Fibonacci sequence?",
            listOf("33", "55", "89", "144"), "33"),
        PracticeQuestion("What is the general term for the sequence: 1, -2, 4, -8, ...?",
            listOf("(-2)^(n+1)", "-2^n", "(-1)^n * 2^n", "(-1)^(n+1) * 2^n"), "(-1)^(n+1) * 2^n"),
        PracticeQuestion("What is the value of sin(pi/4)?",
            listOf("sqrt(2)/2", "1/2", "1/sqrt(2)", "sqrt(3)/2"), "sqrt(2)/2"),
        PracticeQuestion("What is the value of cos(3pi/4)?",
            listOf("-sqrt(2)/2", "-1/2", "1/sqrt(2)", "sqrt(3)/2"), "-1/sqrt(2)"),
        PracticeQuestion("What is the period of y = 2sin(3x+pi/4)?",
            listOf("(2pi)/3", "pi", "(4pi)/3", "2pi"), "(2pi)/3"),
        PracticeQuestion("What is the principal value of tan^-1(sqrt(3))?",
            listOf("pi/3", "pi/4", "pi/6", "pi/2"), "pi/3"),
        PracticeQuestion("What is the value of sec(thetif cos(thet= -1/3?",
            listOf("-sqrt(8)/3", "sqrt(8)/3", "-3/sqrt(8)", "3/sqrt(8)"), "-3/sqrt(8)")

    )
    val oPhysics = listOf<PracticeQuestion>(
        PracticeQuestion(
            "What is the purpose of a fuse in an electric circuit?",
            listOf(
                "To reduce the current",
                "To increase the voltage",
                "To act as a switch",
                "To protect against overloading"
            ),
            "To protect against overloading"
        ),
        PracticeQuestion(
            "Which of the following materials is not magnetic?",
            listOf("Iron", "Copper", "Nickel", "Cobalt"),
            "Copper"
        ),
        PracticeQuestion(
            "What is the application of an electromagnet?",
            listOf(
                "To create a magnetic field",
                "To generate electricity",
                "To measure temperature",
                "To store data"
            ),
            "To create a magnetic field"
        ),
        PracticeQuestion(
            "What happens when a current-carrying conductor is placed in a magnetic field?",
            listOf(
                "It experiences a force perpendicular to both the current and the magnetic field",
                "It becomes less conductive",
                "It becomes more resistive",
                "It stops conducting electricity"
            ),
            "It experiences a force perpendicular to both the current and the magnetic field"
        ),
        PracticeQuestion(
            "What is electromagnetic induction?",
            listOf(
                "The production of a magnetic field by an electric current",
                "The production of an electric current by a changing magnetic field",
                "The conversion of electrical energy to mechanical energy",
                "The transfer of heat through a material"
            ),
            "The production of an electric current by a changing magnetic field"
        ),
        PracticeQuestion(
            "What is the main function of a transformer?",
            listOf(
                "To convert DC to AC",
                "To convert high voltage to low voltage",
                "To convert mechanical energy to electrical energy",
                "To convert sound waves to electrical signals"
            ),
            "To convert high voltage to low voltage"
        ),
        PracticeQuestion(
            "What is an example of an electronic component?",
            listOf("Transistor", "Screwdriver", "Hammer", "Wrench"),
            "Transistor"
        ),
        PracticeQuestion(
            "What is the function of an AND gate in logic circuits?",
            listOf(
                "It outputs true if both inputs are true",
                "It outputs true if either input is true",
                "It outputs true if only one input is true",
                "It outputs false if both inputs are false"
            ),
            "It outputs true if both inputs are true"
        ),
        PracticeQuestion(
            "Who proposed the atomic model?",
            listOf("Ernest Rutherford", "Niels Bohr", "John Dalton", "Robert Boyle"),
            "Niels Bohr"
        ),
        PracticeQuestion(
            "What is radioactivity?",
            listOf(
                "The spontaneous emission of particles or energy from the nucleus of an atom",
                "The attraction between two objects with mass",
                "The resistance of a material to flow of electrical current",
                "The process of converting thermal energy into mechanical energy"
            ),
            "The spontaneous emission of particles or energy from the nucleus of an atom"
        ),
        PracticeQuestion(
            "What is the kinetic theory of matter?",
            listOf(
                "Matter in motion",
                "Matter made of atoms and molecules",
                "Matter with high temperature",
                "Matter that is static"
            ),
            "Matter made of atoms and molecules"
        ),
        PracticeQuestion(
            "What is thermal expansion?",
            listOf(
                "The increase in size of an object due to heat",
                "The decrease in size of an object due to heat",
                "The change in color of an object due to heat",
                "The change in shape of an object due to heat"
            ),
            "The increase in size of an object due to heat"
        ),
        PracticeQuestion(
            "How does conduction transfer heat?",
            listOf(
                "Through electromagnetic waves",
                "Through a fluid",
                "Through direct contact",
                "Through radiation"
            ),
            "Through direct contact"
        ),
        PracticeQuestion(
            "What are the types of waves?",
            listOf(
                "Transverse and longitudinal",
                "Infrared and ultraviolet",
                "Gamma and alpha",
                "Compression and rarefaction"
            ),
            "Transverse and longitudinal"
        ),
        PracticeQuestion(
            "What is the wavelength of a wave?",
            listOf(
                "The time it takes for one complete cycle",
                "The height of the wave",
                "The distance between two adjacent peaks or troughs",
                "The rate at which the wave travels"
            ),
            "The distance between two adjacent peaks or troughs"
        ),
        PracticeQuestion(
            "What is sound?",
            listOf(
                "A type of light wave",
                "A form of electromagnetic radiation",
                "A mechanical wave",
                "A chemical reaction"
            ),
            "A mechanical wave"
        ),
        PracticeQuestion(
            "What are electromagnetic waves?",
            listOf(
                "Waves that require a medium to travel",
                "Waves that transfer energy through matter",
                "Waves that do not require a medium to travel",
                "Waves that are harmful to humans"
            ),
            "Waves that do not require a medium to travel"
        ),
        PracticeQuestion(
            "What is electrostatics?",
            listOf(
                "The study of electric charges at rest",
                "The study of electric charges in motion",
                "The study of magnetic fields",
                "The study of light and its properties"
            ),
            "The study of electric charges at rest"
        ),
        PracticeQuestion(
            "What is the difference between primary and secondary cells?",
            listOf(
                "Primary cells can be recharged, while secondary cells cannot",
                "Primary cells are single-use, while secondary cells can be used multiple times",
                "Primary cells are more expensive than secondary cells",
                "Primary cells are smaller than secondary cells"
            ),
            "Primary cells are single-use, while secondary cells can be used multiple times"
        ),
        PracticeQuestion(
            "What is Ohm's law?",
            listOf(
                "Voltage equals current multiplied by resistance",
                "Resistance equals voltage divided by current",
                "Current equals voltage divided by resistance",
                "Voltage equals resistance divided by current"
            ),
            "Voltage equals current multiplied by resistance"
        ),
        PracticeQuestion(
            "What is an electric circuit?",
            listOf(
                "A path that electricity follows",
                "A device that generates electricity",
                "A barrier that stops electricity",
                "A type of battery"
            ),
            "A path that electricity follows"
        ),
        PracticeQuestion(
            "How do you construct a simple electric circuit?",
            listOf(
                "By connecting a battery to two wires",
                "By connecting a light bulb directly to a battery",
                "By using only one wire",
                "By connecting a battery to a motor"
            ),
            "By connecting a battery to two wires"
        ),
        PracticeQuestion(
            "What is the turning effect of a force called?",
            listOf("Acceleration", "Inertia", "Momentum", "Torque"),
            "Torque"
        ),
        PracticeQuestion(
            "What is the point where an object's weight can be considered to act upon called?",
            listOf("Centre of mass", "Centre of gravity", "Equilibrium point", "Fulcrum"),
            "Centre of gravity"
        ),
        PracticeQuestion(
            "What is the force exerted per unit area called?",
            listOf("Density", "Velocity", "Pressure", "Temperature"),
            "Pressure"
        ),
        PracticeQuestion(
            "What is a machine that makes work easier by changing the size or direction of a force?",
            listOf("Lever", "Pulley", "Wheel and axle", "All of the above"),
            "All of the above"
        ),
        PracticeQuestion(
            "What is the arrangement of parts that make up a physical system called?",
            listOf(
                "Mechanical advantage",
                "Mechanical efficiency",
                "Mechanical structure",
                "Mechanical power"
            ),
            "Mechanical structure"
        ),
        PracticeQuestion(
            "What is the product of a force applied over a distance?",
            listOf("Power", "Energy", "Work", "Force"),
            "Work"
        ),
        PracticeQuestion(
            "What is the ability to do work called?",
            listOf("Power", "Work", "Energy", "Force"),
            "Energy"
        ),
        PracticeQuestion(
            "What is the rate at which work is done called?",
            listOf("Force", "Power", "Energy", "Work rate"),
            "Power"
        ),
        PracticeQuestion(
            question = "What is the SI unit for length?",
            answers = listOf("Meter", "Kilogram", "Second", "Candela"),
            answer = "Meter"
        ),
        PracticeQuestion(
            question = "Is displacement a scalar or vector quantity?",
            answers = listOf("Scalar", "Vector"),
            answer = "Vector"
        ),
        PracticeQuestion(
            question = "What is the difference between speed and velocity?",
            answers = listOf(
                "Speed is distance traveled per unit time; Velocity is displacement per unit time",
                "Speed is displacement per unit time; Velocity is distance traveled per unit time",
                "Speed and Velocity are the same thing"
            ),
            answer = "Speed is distance traveled per unit time; Velocity is displacement per unit time"
        ),
        PracticeQuestion(
            question = "What does the slope of a distance-time graph represent?",
            answers = listOf(
                "Velocity",
                "Speed",
                "Acceleration",
                "Displacement"
            ),
            answer = "Velocity"
        ),
        PracticeQuestion(
            question = "What is the acceleration due to gravity on Earth?",
            answers = listOf("9.81 m/s²", "2.98 m/s²", "6.67x10^-11 m^3/(kg s^2)", "1.62 m/s²"),
            answer = "9.81 m/s²"
        ),
        PracticeQuestion(
            question = "What is the effect of force on materials?",
            answers = listOf(
                "It can change their shape",
                "It can change their temperature",
                "It can change their color",
                "It has no effect on materials"
            ),
            answer = "It can change their shape"
        ),
        PracticeQuestion(
            question = "What is Newton's First Law of Motion?",
            answers = listOf(
                "An object at rest will stay at rest, and an object in motion will stay in motion with a constant velocity, unless acted upon by a net external force",
                "Force equals mass times acceleration",
                "For every action, there is an equal and opposite reaction",
                "None of the above"
            ),
            answer = "An object at rest will stay at rest, and an object in motion will stay in motion with a constant velocity, unless acted upon by a net external force"
        ),
        PracticeQuestion(
            question = "What is the coefficient of static friction?",
            answers = listOf(
                "The maximum value of static friction",
                "The minimum value of static friction",
                "The average value of static friction",
                "The instantaneous value of static friction"
            ),
            answer = "The maximum value of static friction"
        )


    )
    val oGeography = listOf<PracticeQuestion>(
        PracticeQuestion(
            "What is the difference between weather and climate?",
            listOf("Weather refers to short-term atmospheric conditions, while climate refers to long-term patterns of temperature and precipitation.", "Weather refers to long-term patterns of temperature and precipitation, while climate refers to short-term atmospheric conditions.", "Weather and climate are the same thing.", "None of the above."),
            "Weather refers to short-term atmospheric conditions, while climate refers to long-term patterns of temperature and precipitation."
        ),
        PracticeQuestion(
            "What is a mesa?",
            listOf("A flat-topped hill with steep sides, found in arid regions.", "A deep and narrow valley with steep sides, often with a stream or river running through it.", "An area of land that is lower than surrounding areas, characterized by wet, marshy soil.", "A large body of water surrounded by land."),
            "A flat-topped hill with steep sides, found in arid regions."
        ),
        PracticeQuestion(
            "What is an archipelago?",
            listOf("A type of rock formed from solidified lava or magma.", "A chain of islands.", "A narrow strip of land connecting two larger land masses.", "A steep-sided, flat-topped hill."),
            "A chain of islands."
        ),
        PracticeQuestion(
            "What causes monsoons?",
            listOf("The movement of ocean currents.", "The rotation of the Earth on its axis.", "The difference in temperature between land and sea.", "The formation of high- and low-pressure systems."),
            "The difference in temperature between land and sea."
        ),
        PracticeQuestion(
            "What is a fjord?",
            listOf("A deep and narrow valley with steep sides, often with a stream or river running through it.", "A type of rock formed from solidified lava or magma.", "A large body of water surrounded by land.", "A long, narrow inlet with steep sides or cliffs, created by glacial erosion."),
            "A long, narrow inlet with steep sides or cliffs, created by glacial erosion."
        ),
        PracticeQuestion(
            "What is the greenhouse effect?",
            listOf("The trapping of heat near the Earth's surface by certain gases in the atmosphere.", "The process by which water is heated by the sun and evaporates into the atmosphere.", "The movement of air caused by differences in temperature and pressure.", "The cooling of air as it rises and expands."),
            "The trapping of heat near the Earth's surface by certain gases in the atmosphere."
        ),
        PracticeQuestion(
            "What is a delta?",
            listOf("An area of land that is lower than surrounding areas, characterized by wet, marshy soil.", "A broad and gently sloping plain between two mountain ranges.", "A fan-shaped deposit of sediment at the mouth of a river.", "A circular depression in the ground caused by the collapse of a surface layer."),
            "A fan-shaped deposit of sediment at the mouth of a river."
        ),
        PracticeQuestion(
            "What is permafrost?",
            listOf("A layer of soil that is permanently frozen.", "A type of rock formed from solidified lava or magma.", "The process by which ice turns into water vapor without melting.", "A layer of soil that is completely saturated with water."),
            "A layer of soil that is permanently frozen."
        )
        ,
        PracticeQuestion(
            "What is sustainable agriculture?",
            listOf("A type of farming that relies heavily on chemical fertilizers and pesticides.", "A type of farming that uses only organic methods to cultivate crops.", "A type of farming that balances the needs of the environment, society, and economy.", "None of the above."),
            "A type of farming that balances the needs of the environment, society, and economy."
        ),
        PracticeQuestion(
            "What is land reform?",
            listOf("The process by which land is forcibly taken from one owner and given to another.", "The process by which land is redistributed to those who work it, in order to promote greater equity.", "The process by which farmers are encouraged to switch to more profitable crops.", "None of the above."),
            "The process by which land is redistributed to those who work it, in order to promote greater equity."
        ),
        PracticeQuestion(
            "What is a cash crop?",
            listOf("A crop that is grown primarily for sale rather than for consumption by the farmer or their family.", "A crop that is grown without the use of chemical fertilizers or pesticides.", "A crop that is used to feed livestock rather than humans.", "None of the above."),
            "A crop that is grown primarily for sale rather than for consumption by the farmer or their family."
        ),
        PracticeQuestion(
            "What is a monoculture?",
            listOf("The practice of growing multiple crops on a single plot of land.", "The practice of rotating crops in order to maintain soil health.", "The practice of growing a single crop over a large area.", "None of the above."),
            "The practice of growing a single crop over a large area."
        ),
        PracticeQuestion(
            "What is land degradation?",
            listOf("The process by which land becomes more fertile over time.", "The process by which land becomes less fertile over time.", "The process by which land is transformed into desert.", "The process by which land is covered with water."),
            "The process by which land becomes less fertile over time."
        ),
        PracticeQuestion(
            "What is agribusiness?",
            listOf("The business of farming, including everything from production to distribution.", "The process of genetically engineering crops and livestock.", "The process of industrializing agriculture.", "None of the above."),
            "The business of farming, including everything from production to distribution."
        ),
        PracticeQuestion(
            "What is a food desert?",
            listOf("An area where no food is grown or produced.", "An area where access to fresh, healthy food is limited.", "An area where the soil is too poor to support agriculture.", "None of the above."),
            "An area where access to fresh, healthy food is limited."
        ),
        PracticeQuestion(
            "What is agroforestry?",
            listOf("The practice of growing trees alongside crops or livestock.", "The practice of using only chemical fertilizers and pesticides in agriculture.", "The practice of irrigating crops with seawater.", "None of the above."),
            "The practice of growing trees alongside crops or livestock."
        ),
        PracticeQuestion(
            "What is an ecosystem?",
            listOf(
                "A community of living and non-living things that interact with each other",
                "A large body of water",
                "A type of rock formation",
                "A method of farming"
            ),
            "A community of living and non-living things that interact with each other"
        ),
        PracticeQuestion(
            "What is the role of decomposers in an ecosystem?",
            listOf(
                "To break down dead organic matter into nutrients for plants",
                "To hunt and kill prey for food",
                "To provide shade for smaller organisms",
                "To absorb excess carbon dioxide from the atmosphere"
            ),
            "To break down dead organic matter into nutrients for plants"
        ),
        PracticeQuestion(
            "What are non-renewable natural resources?",
            listOf(
                "Resources that cannot be replaced once they are used up",
                "Resources that can be replanted or regrown",
                "Resources that are found only in certain regions of the world",
                "Resources that are created through human labor"
            ),
            "Resources that cannot be replaced once they are used up"
        ),
        PracticeQuestion(
            "What is the difference between a renewable and non-renewable resource?",
            listOf(
                "Renewable resources can be replenished naturally, while non-renewable resources cannot",
                "Non-renewable resources are always cheaper than renewable resources",
                "Renewable resources are less efficient than non-renewable resources",
                "Non-renewable resources have a lower environmental impact than renewable resources"
            ),
            "Renewable resources can be replenished naturally, while non-renewable resources cannot"
        ),
        PracticeQuestion(
            "What are some examples of renewable natural resources?",
            listOf(
                "Solar energy, wind energy, and hydro energy",
                "Oil, coal, and natural gas",
                "Diamonds, gold, and silver",
                "Fish, timber, and crops"
            ),
            "Solar energy, wind energy, and hydro energy"
        ),
        PracticeQuestion(
            "What are some ways to conserve natural resources?",
            listOf(
                "Reduce, reuse, and recycle",
                "Increase consumption of non-renewable resources",
                "Use as much as you want because resources are unlimited",
                "Throw away items that can be reused or recycled"
            ),
            "Reduce, reuse, and recycle"
        )
        ,
        PracticeQuestion(
            "What is a geographic information system (GIS)?",
            listOf(
                "A computer system that captures, stores, analyzes, and displays geographic data",
                "A type of map used to show ocean currents",
                "An instrument used to measure seismic activity",
                "A tool used to calculate the distance between two points"
            ),
            "A computer system that captures, stores, analyzes, and displays geographic data"
        ),
        PracticeQuestion(
            "What is cartography?",
            listOf(
                "The science of making maps",
                "The study of rock formations",
                "The process of mining minerals",
                "The analysis of weather patterns"
            ),
            "The science of making maps"
        ),
        PracticeQuestion(
            "What are some common minerals mined for industrial use?",
            listOf(
                "Copper, iron, and aluminum",
                "Gold, silver, and platinum",
                "Diamonds, emeralds, and rubies",
                "Quartz, feldspar, and mica"
            ),
            "Copper, iron, and aluminum"
        ),
        PracticeQuestion(
            "What is acid mine drainage?",
            listOf(
                "The outflow of acidic water from abandoned mines",
                "The process of extracting minerals using acid",
                "The waste material left over after mining",
                "The method of using chemicals to separate minerals from ore"
            ),
            "The outflow of acidic water from abandoned mines"
        ),
        PracticeQuestion(
            "What is environmental management?",
            listOf(
                "The process of managing human impact on the environment",
                "The process of controlling the weather",
                "The process of cleaning up oil spills in the ocean",
                "The study of how plants and animals interact with their environment"
            ),
            "The process of managing human impact on the environment"
        ),
        PracticeQuestion(
            "What are some strategies for sustainable environmental management?",
            listOf(
                "Reducing waste, conserving energy, and protecting biodiversity",
                "Increasing industrial development, using fossil fuels, and reducing regulations",
                "Building more highways, increasing urbanization, and expanding agriculture",
                "Using pesticides, cutting down forests, and overfishing"
            ),
            "Reducing waste, conserving energy, and protecting biodiversity"
        )
        ,
        PracticeQuestion(
            "What is energy?",
            listOf(
                "The ability to do work or cause change",
                "A type of rock formation",
                "A large body of water",
                "A method of transportation"
            ),
            "The ability to do work or cause change"
        ),
        PracticeQuestion(
            "What are some renewable sources of energy?",
            listOf(
                "Solar, wind, and hydro power",
                "Oil, coal, and natural gas",
                "Nuclear and geothermal power",
                "Fossil fuels and biomass power"
            ),
            "Solar, wind, and hydro power"
        ),
        PracticeQuestion(
            "What is a fossil fuel?",
            listOf(
                "A non-renewable resource formed from the remains of ancient organisms",
                "A renewable resource created through photosynthesis",
                "A type of soil found in arid regions",
                "A type of rock that contains valuable minerals"
            ),
            "A non-renewable resource formed from the remains of ancient organisms"
        ),
        PracticeQuestion(
            "What are some environmental impacts of energy production?",
            listOf(
                "Air and water pollution, deforestation, and climate change",
                "Increased biodiversity, clean air, and clean water",
                "Decreased soil fertility and increased erosion",
                "Habitat destruction and loss of species diversity"
            ),
            "Air and water pollution, deforestation, and climate change"
        )
        ,
        PracticeQuestion(
            "What is a topographic map?",
            listOf(
                "A map that shows elevation using contour lines",
                "A map that shows political boundaries",
                "A map that shows weather patterns",
                "A map that shows ocean currents"
            ),
            "A map that shows elevation using contour lines"
        ),
        PracticeQuestion(
            "What is remote sensing?",
            listOf(
                "The process of collecting data from a distance using satellite or aerial imagery",
                "The process of surveying land using GPS technology",
                "The process of mapping underground features using ground-penetrating radar",
                "The process of collecting data by physically visiting a site"
            ),
            "The process of collecting data from a distance using satellite or aerial imagery"
        ),
        PracticeQuestion(
            "What is geocaching?",
            listOf(
                "An outdoor recreational activity where participants use GPS to find hidden containers",
                "A method of underground mining",
                "A type of soil erosion",
                "A technique for measuring seismic activity"
            ),
            "An outdoor recreational activity where participants use GPS to find hidden containers"
        ),
        PracticeQuestion(
            "What is a geographic information system (GIS)?",
            listOf(
                "A computer system that captures, stores, analyzes, and displays geographic data",
                "A tool used for measuring atmospheric pressure",
                "A type of map projection",
                "A tool used to measure the salinity of ocean water"
            ),
            "A computer system that captures, stores, analyzes, and displays geographic data"
        ),
        PracticeQuestion(
            "What is land reform?",
            listOf(
                "The process of changing land ownership patterns to promote social and economic justice",
                "The process of converting farmland into urban areas",
                "The process of dividing land into smaller plots for greater efficiency",
                "The process of using technology to increase agricultural productivity"
            ),
            "The process of changing land ownership patterns to promote social and economic justice"
        ),
        PracticeQuestion(
            "What are some of the goals of land reform in Zimbabwe?",
            listOf(
                "To address historical injustices related to land ownership, promote equitable distribution of land, and increase agricultural productivity",
                "To promote large-scale commercial agriculture, attract foreign investment, and increase exports",
                "To reduce government involvement in agriculture and encourage private sector development",
                "To expand industrialization and urbanization at the expense of rural areas"
            ),
            "To address historical injustices related to land ownership, promote equitable distribution of land, and increase agricultural productivity"
        ),
        PracticeQuestion(
            "What are some challenges facing Zimbabwe's agricultural sector?",
            listOf(
                "Drought, soil degradation, lack of investment, and limited access to credit",
                "Overfarming, excessive use of pesticides, and loss of biodiversity",
                "Poor infrastructure, inadequate transportation, and inefficient markets",
                "Political instability, corruption, and lack of transparency"
            ),
            "Drought, soil degradation, lack of investment, and limited access to credit"
        ),
        PracticeQuestion(
            "What is contract farming?",
            listOf(
                "A system where farmers grow crops under contract with a buyer who guarantees to purchase the harvest at an agreed price",
                "A system where farmers share their land and resources with other farmers on a rotating basis",
                "A system where farmers sell their crops directly to consumers at a farmers' market",
                "A system where farmers grow a variety of crops for their own consumption and sale"
            ),
            "A system where farmers grow crops under contract with a buyer who guarantees to purchase the harvest at an agreed price"
        )
    )
    val oAccounting = listOf<PracticeQuestion>(

        PracticeQuestion(
            "What is the importance of ethical behavior in business?",
            listOf(
                "To maintain positive reputation",
                "To avoid legal issues",
                "To increase profits",
                "To expand market share"
            ),
            "To maintain positive reputation"
        ),
        PracticeQuestion(
            "What is the consequence of unethical behavior in business?",
            listOf("Legal penalties", "Increased sales", "Positive reputation", "Employee satisfaction"),
            "Legal penalties"
        ),
        PracticeQuestion(
            "What is meant by conflict of interest in business ethics?",
            listOf(
                "When personal interests interfere with professional duties",
                "When employees disagree with company policies",
                "When companies compete with each other",
                "When employees lack motivation"
            ),
            "When personal interests interfere with professional duties"
        ),
        PracticeQuestion(
            "What is the role of a code of ethics in business?",
            listOf(
                "To provide guidance for ethical behavior",
                "To maximize profits",
                "To minimize expenses",
                "To outcompete rivals"
            ),
            "To provide guidance for ethical behavior"
        ),
        PracticeQuestion(
            "What is a departmental account?",
            listOf(
                "An account that tracks the performance of a specific department",
                "An account used to pay employees",
                "An account that records all expenses",
                "An account that records all revenues"
            ),
            "An account that tracks the performance of a specific department"
        ),
        PracticeQuestion(
            "What is the purpose of manufacturing accounts?",
            listOf(
                "To calculate the cost of goods produced",
                "To track the sales revenue",
                "To record the salaries paid to employees",
                "To track the inventory levels"
            ),
            "To calculate the cost of goods produced"
        ),
        PracticeQuestion(
            "What are the components of an end-of-year financial statement for a partnership?",
            listOf(
                "Income statement, balance sheet, appropriation account",
                "Cash flow statement, income statement, balance sheet",
                "Statement of retained earnings, balance sheet, cash flow statement",
                "Statement of changes in equity, income statement, balance sheet"
            ),
            "Income statement, balance sheet, appropriation account"
        ),
        PracticeQuestion(
            "What is a company account?",
            listOf(
                "An account used by a company to track its financial transactions",
                "An account used by an individual to track personal expenses",
                "An account used by the government to collect taxes",
                "An account used by banks to manage customer deposits"
            ),
            "An account used by a company to track its financial transactions"
        ),
        PracticeQuestion(
            "What is the purpose of preparing manufacturing accounts?",
            listOf(
                "To calculate the cost of production and determine profitability",
                "To track the sales revenue",
                "To record the salaries paid to employees",
                "To prepare the income statement"
            ),
            "To calculate the cost of production and determine profitability"
        ),
        PracticeQuestion(
            "What is the difference between a partnership and a company?",
            listOf(
                "A partnership has unlimited liability while a company has limited liability",
                "A partnership has more than one owner while a company has only one owner",
                "A partnership is easier to set up than a company",
                "A partnership has more legal requirements than a company"
            ),
            "A partnership has unlimited liability while a company has limited liability"
        ),
        PracticeQuestion(
            "What are end-of-year financial statements?",
            listOf(
                "Statements that show a company's financial performance for the year",
                "Statements that show a company's cash flow for the year",
                "Statements that show a company's future plans",
                "Statements that show a company's marketing strategy"
            ),
            "Statements that show a company's financial performance for the year"
        ),
        PracticeQuestion(
            "What is the purpose of end-of-year adjustments?",
            listOf(
                "To ensure that financial statements reflect accurate information",
                "To reduce expenses",
                "To increase profits",
                "To pay taxes"
            ),
            "To ensure that financial statements reflect accurate information"
        ),
        PracticeQuestion(
            "What is the difference between capital and revenue expenditure?",
            listOf(
                "Capital expenditure is for long-term assets while revenue expenditure is for current expenses",
                "Capital expenditure is for short-term assets while revenue expenditure is for long-term expenses",
                "Capital expenditure is for variable costs while revenue expenditure is for fixed costs",
                "Capital expenditure is for operational costs while revenue expenditure is for non-operational costs"
            ),
            "Capital expenditure is for long-term assets while revenue expenditure is for current expenses"
        ),
        PracticeQuestion(
            "What are control accounts?",
            listOf(
                "Accounts used to ensure that subsidiary ledger balances match the general ledger balance",
                "Accounts used to track daily transactions",
                "Accounts used to track sales revenue",
                "Accounts used to record salaries paid to employees"
            ),
            "Accounts used to ensure that subsidiary ledger balances match the general ledger balance"
        ),
        PracticeQuestion(
            "What is the purpose of preparing end-of-year financial statements?",
            listOf(
                "To provide stakeholders with an overview of a company's financial performance for the year",
                "To calculate taxes owed by a company",
                "To track inventory levels",
                "To prepare budgets for the upcoming year"
            ),
            "To provide stakeholders with an overview of a company's financial performance for the year"
        ),
        PracticeQuestion(
            "What is the difference between prepaid expenses and accrued expenses in end-of-year adjustments?",
            listOf(
                "Prepaid expenses are paid in advance while accrued expenses are owed but not yet paid",
                "Prepaid expenses are owed but not yet paid while accrued expenses are paid in advance",
                "Prepaid expenses are fixed costs while accrued expenses are variable costs",
                "Prepaid expenses are long-term expenses while accrued expenses are short-term expenses"
            ),
            "Prepaid expenses are paid in advance while accrued expenses are owed but not yet paid"
        ),
        PracticeQuestion(
            "What is accounting and why is it important?",
            listOf(
                "Accounting is the process of recording, classifying, and summarizing financial transactions to provide information for decision-making",
                "Accounting is a way to save money on taxes",
                "Accounting is a way to invest in the stock market",
                "Accounting is a way to create marketing strategies"
            ),
            "Accounting is the process of recording, classifying, and summarizing financial transactions to provide information for decision-making"
        ),
        PracticeQuestion(
            "What is the accounting cycle?",
            listOf(
                "A series of steps that companies follow to record and report financial information",
                "A process for producing goods for sale",
                "A process for hiring new employees",
                "A process for expanding a business"
            ),
            "A series of steps that companies follow to record and report financial information"
        ),
        PracticeQuestion(
            "What are the two methods of data processing in accounting?",
            listOf("Manual and electronic", "Manual and automated", "Electronic and automated", "Digital and manual"),
            "Manual and electronic"
        ),
        PracticeQuestion(
            "What are source documents in accounting?",
            listOf(
                "Documents that provide evidence of financial transactions such as receipts, invoices, and checks",
                "Documents used to track inventory levels",
                "Documents used to calculate employee salaries",
                "Documents used to prepare marketing strategies"
            ),
            "Documents that provide evidence of financial transactions such as receipts, invoices, and checks"
        ),
        PracticeQuestion(
            "What is the purpose of preparing financial statements in the accounting cycle?",
            listOf(
                "To provide stakeholders with an overview of a company's financial performance",
                "To hire new employees",
                "To expand the business",
                "To create marketing strategies"
            ),
            "To provide stakeholders with an overview of a company's financial performance"
        ),
        PracticeQuestion(
            "What is the difference between manual and electronic data processing in accounting?",
            listOf(
                "Manual data processing involves using pen and paper while electronic data processing involves using computers",
                "Manual data processing is faster than electronic data processing",
                "Electronic data processing is more accurate than manual data processing",
                "Electronic data processing is more expensive than manual data processing"
            ),
            "Manual data processing involves using pen and paper while electronic data processing involves using computers"
        ),
        PracticeQuestion("What is the acid-test (quick) ratio?", listOf("Current assets minus inventory, divided by current liabilities", "Current assets plus inventory, divided by current liabilities", "Accounts payable turnover divided by accounts receivable turnover", "Net profit divided by gross profit margin"), "Current assets minus inventory, divided by current liabilities"),
        PracticeQuestion("What is single entry accounting?", listOf("A system of bookkeeping that records only one side of every transaction", "A method of recording all financial transactions in a double entry bookkeeping system", "A record of all outstanding customer debts", "An account used to track daily cash flow"), "A system of bookkeeping that records only one side of every transaction"),
        PracticeQuestion("What is incomplete records accounting?", listOf("A system of bookkeeping where some transactions are not recorded", "A method of recording all financial transactions in a double entry bookkeeping system", "An accounting method used by non-profit organizations", "An account used to track daily cash flow"), "A system of bookkeeping where some transactions are not recorded"),
        PracticeQuestion("What is a non-trading concern?", listOf("An organization that does not engage in buying or selling goods or services for profit", "A business that is not registered with the government", "An investment company that does not trade on the stock exchange", "A charity that only accepts donations from individuals"), "An organization that does not engage in buying or selling goods or services for profit"),
        PracticeQuestion("What is the purpose of a statement of financial activities for a non-trading concern?", listOf("To show the income and expenditure of the organization over a given period of time", "To list the assets and liabilities of the organization at a particular point in time", "To calculate the tax owed by the organization to the government", "To provide a summary of the organization's daily cash flow"), "To show the income and expenditure of the organization over a given period of time")
        ,
        PracticeQuestion("What is a subsidiary book?", listOf("A specialized accounting book used to record a specific type of transaction", "A summary of all the transactions recorded in the general journal", "An account used to track daily cash flow", "An estimate of the company's future financial performance"), "A specialized accounting book used to record a specific type of transaction"),
        PracticeQuestion("What is the purpose of a sales day book?", listOf("To record all credit sales made by the business", "To record all cash sales made by the business", "To track the inventory levels of the business", "To summarize the monthly financial performance of the business"), "To record all credit sales made by the business"),
        PracticeQuestion("What is the ledger?", listOf("A collection of accounts used to keep track of a company's financial transactions", "A record of all outstanding customer debts", "An account used to track daily cash flow", "A summary of all the transactions recorded in the subsidiary books"), "A collection of accounts used to keep track of a company's financial transactions"),
        PracticeQuestion("What is a trial balance?", listOf("A statement that lists all the ledger accounts and their balances", "A record of all outstanding supplier debts", "An estimate of the company's future financial performance", "A summary of all the transactions recorded in the general journal"), "A statement that lists all the ledger accounts and their balances"),
        PracticeQuestion("What is an error of omission?", listOf("When a transaction is completely left out of the accounting records", "When a transaction is recorded with the wrong amount", "When a transaction is recorded with the wrong date", "When a transaction is recorded twice"), "When a transaction is completely left out of the accounting records"),
        PracticeQuestion("What is the consistency concept?", listOf("Requires that once an accounting method has been chosen, it should be used consistently from one period to the next", "Requires that all transactions must be recorded in the same subsidiary book", "Allows for different accounting methods to be used for different transactions", "Requires that all transactions be recorded at their current market value"), "Requires that once an accounting method has been chosen, it should be used consistently from one period to the next"),
        PracticeQuestion("What is the going concern concept?", listOf("Assumes that the business will continue operating indefinitely into the future", "Assumes that the business will shut down in the near future", "Assumes that the business is currently in financial distress", "Assumes that the business will only operate for a limited period of time"), "Assumes that the business will continue operating indefinitely into the future")


    )
    val oComputerScience = listOf<PracticeQuestion>(


        PracticeQuestion("What is algorithm design?", listOf("Creating a plan to solve problems", "Writing code without a plan", "Guessing solutions", "None of the above"), "A"),
        PracticeQuestion("Which of the following is not a problem-solving technique?", listOf("Divide and conquer", "Brute force", "Trial and error", "Copy and paste"), "D"),
        PracticeQuestion("What does IDE stand for?", listOf("Integrated Development Environment", "International Design Excellence", "Intelligent Data Entry", "Interesting Development Entity"), "A"),
        PracticeQuestion("Which operator is used for equality comparison in Kotlin?", listOf("==", "=", "===", "!=="), "A"),
        PracticeQuestion("What is a variable in programming?", listOf("A named storage location for data", "A type of function", "A loop construct", "A compiler error"), "A"),
        PracticeQuestion("What is an array?", listOf("A collection of related values", "A type of loop", "A control structure", "A method of input/output"), "A"),
        PracticeQuestion("What is a loop?", listOf("A control structure that repeats a block of code", "A variable", "An error message", "A type of comment"), "A"),
        PracticeQuestion("What is an if statement?", listOf("A control structure that executes code based on a condition", "A type of function", "A loop construct", "A compiler error"), "A")
        ,
        PracticeQuestion("What is cybersecurity?", listOf("The practice of protecting computer systems from theft or damage", "The use of technology to create art", "The study of human behavior", "None of the above"), "A"),
        PracticeQuestion("What is hacking?", listOf("Unauthorized access to a computer system", "A type of programming language", "A form of social engineering", "A hardware component"), "A"),
        PracticeQuestion("What is phishing?", listOf("An attempt to obtain sensitive information by disguising as a trustworthy entity", "A type of network topology", "A software tool for testing applications", "A database management system"), "A"),
        PracticeQuestion("What is intellectual property?", listOf("A creation of the mind that has commercial value", "A type of malware", "A software design pattern", "A file format for images"), "A"),
        PracticeQuestion("What is systems analysis?", listOf("The process of studying a system to identify its components and their interactions", "A programming language", "A type of database", "A web development framework"), "A"),
        PracticeQuestion("What is a use case diagram?", listOf("A diagram that describes the steps a user performs to accomplish a task", "A diagram that shows the relationships between classes", "A diagram that models the flow of data in a system", "A diagram that represents the architecture of a system"), "A"),
        PracticeQuestion("What is system design?", listOf("The process of defining the architecture, components, modules, interfaces, and data for a system", "A type of software testing", "A database management technique", "A network security measure"), "A"),
        PracticeQuestion("What is a prototype?", listOf("A preliminary model of a system or product", "A software development methodology", "A type of programming language", "A network protocol"), "A")
        ,
        PracticeQuestion("What is hardware?", listOf("The physical components of a computer system", "The instructions that a computer follows", "The programs that run on a computer", "The data that is processed by a computer"), "A"),
        PracticeQuestion("What is software?", listOf("The programs that run on a computer system", "The physical components of a computer system", "The output generated by a computer system", "The data that is input into a computer system"), "A"),
        PracticeQuestion("What is an operating system?", listOf("Software that manages computer hardware and provides common services for other software", "A type of computer virus", "An application program", "A programming language"), "A"),
        PracticeQuestion("What is an algorithm?", listOf("A set of steps for solving a problem or performing a task", "A type of programming language", "A hardware component", "A database management system"), "A"),
        PracticeQuestion("What is computer graphics?", listOf("The creation, manipulation, and storage of images on a computer", "The study of human-computer interaction", "The use of computers to control industrial processes", "The design of computer systems"), "A"),
        PracticeQuestion("What is artificial intelligence?", listOf("The development of computer systems that can perform tasks that would typically require human intelligence", "The study of algorithms and databases", "The creation of computer networks", "The development of software applications"), "A"),
        PracticeQuestion("What is web development?", listOf("The creation of websites and web applications", "The development of computer hardware", "The study of computer networks", "The management of computer systems"), "A"),
        PracticeQuestion("What is database management?", listOf("The organization, storage, and retrieval of data in a computer system", "The development of software applications", "The creation of computer networks", "The design of computer systems"), "A")

        ,
        PracticeQuestion(
            "What is a primary key in a database table?",
            listOf("A unique identifier for each record", "A foreign key from another table", "An index for efficient searching", "A field that stores binary data"),
            "A unique identifier for each record"
        ),
        PracticeQuestion(
            "What is the purpose of the SQL SELECT statement?",
            listOf("To insert new records into a table", "To update existing records in a table", "To retrieve data from one or more tables", "To delete records from a table"),
            "To retrieve data from one or more tables"
        ),
        PracticeQuestion(
            "What is normalization in database design?",
            listOf("The process of removing redundant data", "The process of combining multiple tables into one", "The process of creating indexes for faster searching", "The process of securing the data stored in a database"),
            "The process of removing redundant data"
        ),
        PracticeQuestion(
            "What is a JOIN operation in SQL?",
            listOf("A way to combine data from two or more tables based on a related column", "A way to create a new table by merging two existing tables", "A way to delete data from one or more tables", "A way to update data in one or more tables"),
            "A way to combine data from two or more tables based on a related column"
        ),
        PracticeQuestion(
            "What is HTML and what is it used for in web design?",
            listOf("Hyper Text Markup Language, used to structure content on a web page", "High Tech Markup Language, used to style content on a web page", "Hyperspace Markup Language, used to add animations to a web page", "Hyper Text Markdown Language, used to add interactivity to a web page"),
            "Hyper Text Markup Language, used to structure content on a web page"
        ),
        PracticeQuestion(
            "What is CSS and what is it used for in web design?",
            listOf("Cascading Style Sheets, used to style the visual appearance of a web page", "Creative Style Sheets, used to create animations on a web page", "Complex Style Sheets, used to add interactivity to a web page", "Colorful Style Sheets, used to add colors to a web page"),
            "Cascading Style Sheets, used to style the visual appearance of a web page"
        ),
        PracticeQuestion(
            "What is responsive design in web design?",
            listOf("Designing a website that adapts to different screen sizes and devices", "Designing a website that uses bright and bold colors", "Designing a website that has many interactive features", "Designing a website that loads quickly"),
            "Designing a website that adapts to different screen sizes and devices"
        ),
        PracticeQuestion(
            "What is a wireframe in web design?",
            listOf("A visual representation of a website's layout and structure", "A written document outlining a website's content", "A detailed plan of a website's functionality", "A prototype of a website's design"),
            "A visual representation of a website's layout and structure"
        ),
        PracticeQuestion(
            "What is a business model canvas?",
            listOf("A visual tool used to describe, analyze, and design a business model", "A spreadsheet used to track expenses and revenues", "A presentation template used to pitch a business idea", "A customer feedback form used to gather user insights"),
            "A visual tool used to describe, analyze, and design a business model"
        ),
        PracticeQuestion(
            "What is market segmentation?",
            listOf("The process of dividing a market into smaller groups with similar needs or characteristics", "The process of identifying potential customers for a product or service", "The process of setting the price of a product or service", "The process of promoting a product or service to potential customers"),
            "The process of dividing a market into smaller groups with similar needs or characteristics"
        ),
        PracticeQuestion(
            "What is a minimum viable product (MVP)?",
            listOf("A version of a product that has just enough features to satisfy early customers and gather feedback for future development", "A product that has all the features and functionality planned for the final release", "A product that is released without any testing or quality assurance", "A product that is designed to be cheap and simple to manufacture"),
            "A version of a product that has just enough features to satisfy early customers and gather feedback for future development"
        ),
        PracticeQuestion(
            "What is binary representation?",
            listOf("A system of representing data using two digits: 0 and 1", "A system of representing data using ten digits: 0 to 9", "A system of representing data using letters from A to F", "A system of representing data using a combination of digits and letters"),
            "A system of representing data using two digits: 0 and 1"
        ),
        PracticeQuestion(
            "What is ASCII?",
            listOf("A character encoding standard used to represent text in computers", "A network protocol used for sending email messages", "A programming language used for web development", "A file format used for storing digital images"),
            "A character encoding standard used to represent text in computers"
        ),
        PracticeQuestion(
            "What is a byte?",
            listOf("A unit of digital information that consists of 8 bits", "A unit of digital information that consists of 16 bits", "A unit of digital information that consists of 32 bits", "A unit of digital information that consists of 64 bits"),
            "A unit of digital information that consists of 8 bits"
        ),
        PracticeQuestion(
            "What is a LAN?",
            listOf("A local area network that connects devices in a small geographical area", "A wide area network that connects devices in different parts of the world", "A network topology that uses a central hub to connect devices", "A network protocol used for sending and receiving emails"),
            "A local area network that connects devices in a small geographical area"
        ),
        PracticeQuestion(
            "What is HTTP?",
            listOf("A protocol used for transferring data over the internet", "A programming language used for web development", "A software application used for browsing web pages", "A file format used for storing digital images"),
            "A protocol used for transferring data over the internet"
        ),
        PracticeQuestion(
            "What is a router?",
            listOf("A networking device that forwards data packets between computer networks", "A software application used for browsing web pages", "A programming language used for web development", "A file format used for storing digital images"),
            "A networking device that forwards data packets between computer networks"
        ),
        PracticeQuestion(
            "What is DNS?",
            listOf("Domain Name System, a system that translates domain names to IP addresses", "Directory Network Services, a system that manages network directories", "Dynamic Network Solutions, a system that provides real-time network monitoring", "Data Naming Scheme, a system used for naming data files"),
            "Domain Name System, a system that translates domain names to IP addresses"
        ),
        PracticeQuestion(
            "What is TCP/IP?",
            listOf("A suite of protocols used for communication between devices on the internet", "A programming language used for web development", "A software application used for browsing web pages", "An encryption algorithm used for securing data transmissions"),
            "A suite of protocols used for communication between devices on the internet"
        )
    )
    val oChemistry = listOf<PracticeQuestion>(
        PracticeQuestion(
            "What is the functional group found in alcohols?",
            listOf("Amine", "Ketone", "Hydroxyl", "Carboxylic acid"),
            "Hydroxyl"
        ),
        PracticeQuestion(
            "Which of these is NOT a carboxylic acid?",
            listOf("Acetic acid", "Formic acid", "Butanoic acid", "Methanol"),
            "Methanol"
        ),
        PracticeQuestion(
            "What type of polymer is nylon?",
            listOf("Polyethylene", "Polyester", "Polyurethane", "Polyamide"),
            "Polyamide"
        ),
        PracticeQuestion(
            "What is the monomer of PVC?",
            listOf("Vinyl chloride", "Ethylene", "Styrene", "Acrylonitrile"),
            "Vinyl chloride"
        ),
        PracticeQuestion(
            "What is the process of converting waste materials into new materials or products called?",
            listOf("Recycling", "Composting", "Landfilling", "Incineration"),
            "Recycling"
        ),
        PracticeQuestion(
            "What is the most abundant greenhouse gas?",
            listOf("Carbon dioxide", "Methane", "Nitrous oxide", "Chlorofluorocarbons"),
            "Carbon dioxide"
        ),
        PracticeQuestion(
            "What is the simplest alkane?",
            listOf("Methane", "Ethane", "Propane", "Butane"),
            "Methane"
        ),
        PracticeQuestion(
            "What type of hydrocarbon is benzene?",
            listOf("Alkene", "Alkyne", "Aromatic", "Cyclic"),
            "Aromatic"
        ),
        PracticeQuestion(
            "What is the most commonly used metal in electrical wiring?",
            listOf("Aluminum", "Copper", "Iron", "Gold"),
            "Copper"
        ),
        PracticeQuestion(
            "Which metal is known as a liquid metal at room temperature?",
            listOf("Mercury", "Lead", "Silver", "Zinc"),
            "Mercury"
        ),
        PracticeQuestion(
            "What is the most abundant non-metal on Earth?",
            listOf("Oxygen", "Nitrogen", "Carbon", "Hydrogen"),
            "Nitrogen"
        ),
        PracticeQuestion(
            "Which non-metal is a good conductor of electricity?",
            listOf("Sulfur", "Carbon", "Iodine", "Graphite"),
            "Graphite"
        ),
        PracticeQuestion(
            "Which fuel is commonly used in automobiles?",
            listOf("Coal", "Petroleum", "Natural Gas", "Wood"),
            "Petroleum"
        ),
        PracticeQuestion(
            "Which fuel is produced by the decomposition of ancient organic materials?",
            listOf("Biomass", "Solar Energy", "Wind Energy", "Fossil Fuel"),
            "Fossil Fuel"
        ),
        PracticeQuestion(
            "What is the suffix used for naming alcohols?",
            listOf("-ane", "-ene", "-ol", "-yne"),
            "-ol"
        ),
        PracticeQuestion(
            "Which compound is an example of an ester?",
            listOf("Ethanol", "Methane", "Acetone", "Ethyl Acetate"),
            "Ethyl Acetate"
        ),
        PracticeQuestion(
            question = "Which gas is responsible for most air pollution?",
            answers = listOf("Oxygen", "Carbon dioxide", "Nitrogen", "Sulfur dioxide"),
            answer = "Sulfur dioxide"
        ),
        PracticeQuestion(
            question = "What is the process of removing impurities from water called?",
            answers = listOf("Distillation", "Filtration", "Evaporation", "Condensation"),
            answer = "Filtration"
        ),
        PracticeQuestion(
            question = "What herb is commonly used to soothe an upset stomach?",
            answers = listOf("Basil", "Rosemary", "Peppermint", "Thyme"),
            answer = "Peppermint"
        ),
        PracticeQuestion(
            question = "What laboratory technique is used to separate DNA fragments by size?",
            answers = listOf("Chromatography", "Electrophoresis", "Titration", "Spectroscopy"),
            answer = "Electrophoresis"
        ),
        PracticeQuestion(
            question = "What is the physical substance that everything in the universe is made of?",
            answers = listOf("Energy", "Molecules", "Atoms", "Elements"),
            answer = "Atoms"
        ),
        PracticeQuestion(
            question = "What is the overall cell reaction when a zinc electrode is placed in a copper (II) sulfate solution?",
            answers = listOf(
                "Zn(s) + Cu2+(aq) -> Zn2+(aq) + Cu(s)",
                "Cu(s) + Zn2+(aq) -> Cu2+(aq) + Zn(s)",
                "Zn(s) + CuSO4(aq) -> ZnSO4(aq) + Cu(s)",
                "CuSO4(aq) + Zn(s) -> Cu(s) + ZnSO4(aq)"
            ),
            answer = "Zn(s) + Cu2+(aq) -> Zn2+(aq) + Cu(s)"
        ),
        PracticeQuestion(
            question = "Which type of reaction absorbs energy from the surroundings?",
            answers = listOf("Endothermic", "Exothermic", "Neutralization", "Redox"),
            answer = "Endothermic"
        ),
        PracticeQuestion(
            question = "What is the equilibrium constant expression for the following reaction? 2NO(g) + O2(g) <-> 2NO2(g)",
            answers = listOf(
                "[NO2]^2/([NO]^2[O2])",
                "[NO]^2[O2]/[NO2]^2",
                "[NO2]/([NO]^2[O2]^2)",
                "[NO]^2/[O2]"
            ),
            answer = "[NO2]^2/([NO]^2[O2])"
        ),
        PracticeQuestion(
            question = "What is the rate equation for a second-order reaction?",
            answers = listOf("rate = k[A][B]", "rate = k[A]", "rate = k[B]^2", "rate = k[A]^2[B]"),
            answer = "rate = k[A]^2"
        ),
        PracticeQuestion(
            question = "What is the oxidation state of nitrogen in HNO3?",
            answers = listOf("+1", "+2", "+4", "+5"),
            answer = "+5"
        ),
        PracticeQuestion(
            question = "What is the activation energy of a reaction?",
            answers = listOf(
                "The minimum amount of energy required for a reaction to occur",
                "The maximum amount of energy released by a reaction",
                "The energy change when reactants are converted to products",
                "The energy released per mole of product formed"
            ),
            answer = "The minimum amount of energy required for a reaction to occur"
        ),
        PracticeQuestion(
            "What is the primary cause of air pollution?",
            listOf(
                "Industrial emissions",
                "Car exhaust fumes",
                "Deforestation",
                "Chemical leaks"
            ),
            "Industrial emissions"
        ),
        PracticeQuestion(
            "Which of the following is NOT a type of pollution?",
            listOf(
                "Air pollution",
                "Water pollution",
                "Noise pollution",
                "Food pollution"
            ),
            "Food pollution"
        ),
        PracticeQuestion(
            "What is the process of removing salt from seawater called?",
            listOf(
                "Distillation",
                "Filtration",
                "Evaporation",
                "Reverse osmosis"
            ),
            "Reverse osmosis"
        ),
        PracticeQuestion(
            "What is the most commonly used chemical for water disinfection?",
            listOf(
                "Chlorine",
                "Hydrogen peroxide",
                "Ozone",
                "Sodium hypochlorite"
            ),
            "Chlorine"
        ),
        PracticeQuestion(
            "What herb is commonly used to aid digestion?",
            listOf(
                "Peppermint",
                "Lavender",
                "Rosemary",
                "Thyme"
            ),
            "Peppermint"
        ),
        PracticeQuestion(
            "What herb is commonly used to alleviate anxiety and stress?",
            listOf(
                "Chamomile",
                "Sage",
                "Basil",
                "Dill"
            ),
            "Chamomile"
        ),
        PracticeQuestion(
            "What technique is used to separate mixtures based on their boiling points?",
            listOf(
                "Chromatography",
                "Filtration",
                "Distillation",
                "Crystallization"
            ),
            "Distillation"
        ),
        PracticeQuestion(
            "What technique is used to amplify DNA sequences?",
            listOf(
                "Polymerase chain reaction (PCR)",
                "Gel electrophoresis",
                "Western blotting",
                "Southern blotting"
            ),
            "Polymerase chain reaction (PCR)"
        ),
        PracticeQuestion(
            "What state of matter has a definite volume but no definite shape?",
            listOf(
                "Solid",
                "Liquid",
                "Gas",
                "Plasma"
            ),
            "Liquid"
        ),
        PracticeQuestion(
            "What type of matter is composed of atoms with the same atomic number?",
            listOf(
                "Element",
                "Compound",
                "Mixture",
                "Solution"
            ),
            "Element"
        ),
        PracticeQuestion(
            "What is the chemical symbol for gold?",
            listOf("Au", "Ag", "Cu", "Fe"),
            "Au"
        ),
        PracticeQuestion(
            "What is the difference between an element and a compound?",
            listOf(
                "An element is a pure substance made up of only one type of atom, while a compound is a substance made up of two or more different types of atoms.",
                "An element is a substance made up of two or more different types of atoms, while a compound is a pure substance made up of only one type of atom.",
                "An element is a substance that cannot be broken down into simpler substances by chemical means, while a compound can be broken down into simpler substances by chemical means.",
                "An element is a substance that can be broken down into simpler substances by chemical means, while a compound cannot be broken down into simpler substances by chemical means."
            ),
            "An element is a pure substance made up of only one type of atom, while a compound is a substance made up of two or more different types of atoms."
        ),
        PracticeQuestion(
            "What type of bonding occurs between nonmetallic elements?",
            listOf(
                "Covalent bonding",
                "Ionic bonding",
                "Metallic bonding",
                "Van der Waals bonding"
            ),
            "Covalent bonding"
        ),
        PracticeQuestion(
            "How many moles of carbon dioxide are produced when 2 moles of methane react with oxygen according to the following equation: CH4 + 2O2 -> CO2 + 2H2O",
            listOf("1 mole", "2 moles", "3 moles", "4 moles"),
            "2 moles"
        ),
        PracticeQuestion(
            "What is the pH of a solution with a hydrogen ion concentration of 1.0 x 10^-9 M?",
            listOf("9", "7", "5", "3"),
            "9"
        ),
        PracticeQuestion(
            "What is the chemical symbol for calcium?",
            listOf("Ca", "Cu", "C", "Cl"),
            "Ca"
        ),
        PracticeQuestion(
            "What is the atomic number of nitrogen?",
            listOf("7", "8", "6", "9"),
            "7"
        ),
        PracticeQuestion(
            "Which element has the highest electronegativity value?",
            listOf("Fluorine", "Oxygen", "Carbon", "Hydrogen"),
            "Fluorine"
        )

    )
    val oCombinedScience =  listOf<PracticeQuestion>(

        PracticeQuestion(
            "What is the function of red blood cells in our body?",
            listOf("To carry oxygen to body tissues", "To fight infections", "To produce energy", "To regulate body temperature"),
            "To carry oxygen to body tissues"
        ),
        PracticeQuestion(
            "What is the name of the tube that carries sperm from the testes to the urethra?",
            listOf("Vas deferens", "Ureter", "Fallopian tube", "Epididymis"),
            "Vas deferens"
        ),
        PracticeQuestion(
            "Which of the following is NOT a method of disease transmission?",
            listOf("Mosquito bites", "Contact with infected bodily fluids", "Using public restrooms", "Sharing personal items"),
            "Using public restrooms"
        ),
        PracticeQuestion(
            "What is the male reproductive organ in plants called?",
            listOf("Stamen", "Pistil", "Ovary", "Sepal"),
            "Stamen"
        ),
        PracticeQuestion(
            "What is the name of the virus that causes COVID-19?",
            listOf("SARS-CoV-2", "HIV", "Ebola", "Influenza"),
            "SARS-CoV-2"
        ),
        PracticeQuestion(
            "What is the process by which water moves from roots to leaves in plants called?",
            listOf("Transpiration", "Photosynthesis", "Respiration", "Digestion"),
            "Transpiration"
        ),

        PracticeQuestion(
            "What is the smallest particle of an element that can exist?",
            listOf("Atom", "Molecule", "Ion", "Compound"),
            "Atom"
        ),
        PracticeQuestion(
            "Which state of matter has a fixed shape and volume?",
            listOf("Solid", "Liquid", "Gas", "Plasma"),
            "Solid"
        ),
        PracticeQuestion(
            "What is the pH of a neutral solution?",
            listOf("7", "0", "14", "1"),
            "7"
        ),
        PracticeQuestion(
            "Which type of salt is formed when a strong acid reacts with a weak base?",
            listOf("Acidic salt", "Basic salt", "Neutral salt", "Double salt"),
            "Acidic salt"
        ),
        PracticeQuestion(
            "What is the process of addition of oxygen to a substance called?",
            listOf("Oxidation", "Reduction", "Combustion", "Hydrolysis"),
            "Oxidation"
        ),
        PracticeQuestion(
            "What is the name of the process by which alkenes are converted to alkanes?",
            listOf("Hydrogenation", "Halogenation", "Oxidation", "Esterification"),
            "Hydrogenation"
        ),
        PracticeQuestion(
            "Which industrial process is used to produce ammonia from nitrogen and hydrogen?",
            listOf("Haber process", "Ostwald process", "Contact process", "Solvent extraction"),
            "Haber process"
        ),
        PracticeQuestion(
            "What is the name of the functional group present in alcohols?",
            listOf("Hydroxyl group", "Carboxyl group", "Amino group", "Methyl group"),
            "Hydroxyl group"
        ),
        PracticeQuestion(
            "What is the most important reason for following laboratory rules and safety precautions?",
            listOf("To impress your teacher", "To avoid getting in trouble", "To protect yourself and others", "To save time"),
            "To protect yourself and others"
        ),
        PracticeQuestion(
            "What should you do if you spill a chemical on yourself or someone else?",
            listOf("Wipe it off with your hand", "Rinse with water immediately for 15 minutes", "Leave it alone and hope for the best", "Ask someone else to take care of it"),
            "Rinse with water immediately for 15 minutes"
        ),
        PracticeQuestion(
            "What is the basic unit of life?",
            listOf("Tissue", "Organ", "Cell", "System"),
            "Cell"
        ),
        PracticeQuestion(
            "Which level of organization includes multiple organs working together?",
            listOf("Tissue", "Organ", "Cell", "System"),
            "Organ"
        ),
        PracticeQuestion(
            "What is the process by which our body breaks down food into smaller molecules?",
            listOf("Digestion", "Photosynthesis", "Respiration", "Circulation"),
            "Digestion"
        ),
        PracticeQuestion(
            "Which nutrient is responsible for building and repairing muscles?",
            listOf("Carbohydrates", "Protein", "Fat", "Vitamins"),
            "Protein"
        ),
        PracticeQuestion(
            "What gas do we inhale during respiration?",
            listOf("Carbon dioxide", "Nitrogen", "Oxygen", "Water vapor"),
            "Oxygen"
        ),
        PracticeQuestion(
            "What is the name of the organ where gas exchange occurs in the respiratory system?",
            listOf("Stomach", "Lungs", "Liver", "Heart"),
            "Lungs"
        ),

        PracticeQuestion(
            "What is the SI unit for length?",
            listOf("Meter", "Kilogram", "Second", "Newton"),
            "Meter"
        ),
        PracticeQuestion(
            "What is the SI unit for mass?",
            listOf("Meter", "Kilogram", "Second", "Newton"),
            "Kilogram"
        ),
        PracticeQuestion(
            "What force is required to accelerate a 10kg object at a rate of 5 m/s²?",
            listOf("2 N", "20 N", "50 N", "100 N"),
            "50 N"
        ),
        PracticeQuestion(
            "What is the formula for calculating gravitational potential energy?",
            listOf("PE=mgh", "F=ma", "KE=½mv²", "P=VI"),
            "PE=mgh"
        ),
        PracticeQuestion(
            "What type of magnet opposes an external magnetic field?",
            listOf("Permanent magnet", "Temporary magnet", "Electromagnet", "Diamagnetic material"),
            "Diamagnetic material"
        ),
        PracticeQuestion(
            "What is the unit of electric current?",
            listOf("Volt", "Ampere", "Ohm", "Watt"),
            "Ampere"
        ),
        PracticeQuestion(
            "What is the difference between AC and DC electricity?",
            listOf("AC is safer than DC", "DC can be stored in batteries while AC cannot", "AC flows in one direction while DC flows in both directions", "DC is used in homes while AC is used in vehicles"),
            "DC can be stored in batteries while AC cannot"
        ),
        PracticeQuestion(
            "What device is used to measure electric current?",
            listOf("Voltmeter", "Ammeter", "Ohmmeter", "Wattmeter"),
            "Ammeter"
        )
    )
    val oBiology = listOf<PracticeQuestion>(

        // 6.1 Branches of Biology
        PracticeQuestion(
            "What is the study of plants called?",
            listOf("Zoology", "Botany", "Microbiology", "Genetics"),
            "Botany"
        ),
        PracticeQuestion(
            "Which branch of biology studies the interactions between living organisms and their environment?",
            listOf("Ecology", "Physiology", "Anatomy", "Biochemistry"),
            "Ecology"
        ),
        PracticeQuestion(
            "What is the scientific study of animals called?",
            listOf("Ecology", "Entomology", "Ornithology", "Zoology"),
            "Zoology"
        ),

        // 6.2 Chemicals of life
        PracticeQuestion(
            "What are the building blocks of proteins called?",
            listOf("Nucleotides", "Fatty acids", "Monosaccharides", "Amino acids"),
            "Amino acids"
        ),
        PracticeQuestion(
            "Which macromolecule stores genetic information?",
            listOf("Carbohydrates", "Lipids", "Proteins", "Nucleic acids"),
            "Nucleic acids"
        ),
        PracticeQuestion(
            "What do you call the process by which cells break down glucose to make energy?",
            listOf("Osmosis", "Photosynthesis", "Respiration", "Fermentation"),
            "Respiration"
        ),

        // 6.3 Cells and cellular activities
        PracticeQuestion(
            "What is the outermost layer of animal cells called?",
            listOf("Nucleus", "Mitochondria", "Cell wall", "Cell membrane"),
            "Cell membrane"
        ),
        PracticeQuestion(
            "Which organelle is responsible for making proteins?",
            listOf("Ribosome", "Lysosome", "Golgi apparatus", "Endoplasmic reticulum"),
            "Ribosome"
        ),
        PracticeQuestion(
            "What do you call the fluid inside a cell that contains all its organelles?",
            listOf("Cytoplasm", "Nucleus", "Chloroplast", "Vacuole"),
            "Cytoplasm"
        ),
        PracticeQuestion(
            "What is the role of enzymes in digestion?",
            listOf(
                "Breaking down large molecules into smaller ones",
                "Moving food through the digestive tract",
                "Absorbing nutrients into the bloodstream",
                "Producing waste products"
            ),
            "Breaking down large molecules into smaller ones"
        ),
        PracticeQuestion(
            "What are the two types of plant tissues responsible for transporting water and nutrients?",
            listOf("Xylem and phloem", "Epidermis and cortex", "Stomata and guard cells", "Mesophyll and palisade"),
            "Xylem and phloem"
        ),
        PracticeQuestion(
            "What is the function of the enzyme amylase in the human body?",
            listOf(
                "Breaks down carbohydrates in the mouth and small intestine",
                "Breaks down proteins in the stomach",
                "Breaks down fats in the pancreas",
                "Breaks down nucleic acids in the liver"
            ),
            "Breaks down carbohydrates in the mouth and small intestine"
        ),
        PracticeQuestion(
            "What is the primary function of leaves in plants?",
            listOf("Photosynthesis", "Water absorption", "Nutrient storage", "Reproduction"),
            "Photosynthesis"
        ),
        PracticeQuestion(
            "What is the difference between a herbivore and a carnivore?",
            listOf(
                "Herbivores eat plants, while carnivores eat meat",
                "Herbivores live on land, while carnivores live in water",
                "Herbivores have fur, while carnivores have scales",
                "Herbivores are nocturnal, while carnivores are diurnal"
            ),
            "Herbivores eat plants, while carnivores eat meat"
        ),
        PracticeQuestion(
            "What is the function of the circulatory system?",
            listOf(
                "To transport oxygen and nutrients to cells",
                "To control body movements",
                "To regulate body temperature",
                "To produce hormones"
            ),
            "To transport oxygen and nutrients to cells"
        ),
        PracticeQuestion(
            "What is an example of an enzyme used in laundry detergent?",
            listOf("Protease", "Lipase", "Amylase", "Cellulase"),
            "Protease"
        ),
        PracticeQuestion(
            "What are the three types of muscle tissue found in animals?",
            listOf(
                "Skeletal, smooth, and cardiac",
                "Epithelial, connective, and nervous",
                "Adipose, cartilage, and bone",
                "Sensory, motor, and interneuron"
            ),
            "Skeletal, smooth, and cardiac"
        ),
        // Ecosystems
        PracticeQuestion(
            "What is an ecosystem?",
            listOf(
                "A group of animals",
                "A community of plants",
                "A system of living and non-living things",
                "A type of food chain"
            ),
            "A system of living and non-living things"
        ),
        PracticeQuestion(
            "What is photosynthesis?",
            listOf(
                "The process of converting light energy into chemical energy",
                "The process of breaking down food to release energy",
                "The process of exchanging gases in the lungs",
                "The process of synthesizing proteins"
            ),
            "The process of converting light energy into chemical energy"
        ),
        PracticeQuestion(
            "What is a food chain?",
            listOf(
                "A list of all the foods a person eats",
                "A linear sequence of who eats whom in a biological community",
                "A type of digestive system in insects",
                "A way to measure the energy in an ecosystem"
            ),
            "A linear sequence of who eats whom in a biological community"
        ),

// Health and Disease
        PracticeQuestion("What causes malaria?", listOf("Bacteria", "Virus", "Parasite", "Fungi"), "Parasite"),
        PracticeQuestion(
            "What is the immune system?",
            listOf(
                "A system of hormones that regulate growth and development",
                "A network of blood vessels that circulates blood throughout the body",
                "A collection of organs that help filter waste from the body",
                "A complex system of cells, tissues, and organs that work together to defend the body against foreign invaders"
            ),
            "A complex system of cells, tissues, and organs that work together to defend the body against foreign invaders"
        ),
        PracticeQuestion(
            "What is a vaccine?",
            listOf(
                "A treatment for cancer",
                "A medication used to treat high blood pressure",
                "A substance that stimulates the body's immune system to produce immunity to a specific disease",
                "A type of surgery to remove tumors"
            ),
            "A substance that stimulates the body's immune system to produce immunity to a specific disease"
        ),
        PracticeQuestion(
            "How do animals maintain homeostasis?",
            listOf(
                "By regulating internal conditions despite external changes",
                "By adapting to new environments through evolution",
                "By reproducing at a steady rate",
                "By communicating with other members of their species"
            ),
            "By regulating internal conditions despite external changes"
        ),
        PracticeQuestion(
            "What is fermentation?",
            listOf(
                "A metabolic process that converts sugar to acids, gases, or alcohol",
                "The process by which cells break down glucose into pyruvate",
                "The process by which plants convert light energy to chemical energy",
                "The process by which cells produce ATP"
            ),
            "A metabolic process that converts sugar to acids, gases, or alcohol"
        ),
        PracticeQuestion(
            "What is a plasmid?",
            listOf(
                "A small DNA molecule within a cell that is physically separated from chromosomal DNA and can replicate independently",
                "A subcellular structure that carries genetic information",
                "An organelle responsible for protein synthesis",
                "A type of RNA molecule"
            ),
            "A small DNA molecule within a cell that is physically separated from chromosomal DNA and can replicate independently"
        ),
        PracticeQuestion(
            "What is biotechnology?",
            listOf(
                "The use of living organisms or their products to modify or improve human health or the environment",
                "The scientific study of living organisms",
                "The process of classifying and naming organisms",
                "The production of new species"
            ),
            "The use of living organisms or their products to modify or improve human health or the environment"
        ),
        PracticeQuestion(
            "What is a gene?",
            listOf(
                "A sequence of DNA that codes for a particular protein",
                "A type of RNA molecule",
                "A subcellular structure responsible for protein synthesis",
                "A type of enzyme"
            ),
            "A sequence of DNA that codes for a particular protein"
        ),
        PracticeQuestion(
            "What is genetic variation?",
            listOf(
                "The variety of different types of genes in a population",
                "The study of genes and heredity",
                "The classification of living things",
                "The production of new species"
            ),
            "The variety of different types of genes in a population"
        ),
        PracticeQuestion(
            "What is an ecosystem?",
            listOf(
                "A community of living and nonliving things that interact with each other in a particular environment",
                "The study of genes and heredity",
                "The production of new species",
                "The classification of living things"
            ),
            "A community of living and nonliving things that interact with each other in a particular environment"
        ),
        PracticeQuestion(
            "What is biodiversity?",
            listOf(
                "The variety of life in a particular ecosystem or on Earth as a whole",
                "The study of genes and heredity",
                "The production of new species",
                "The classification of living things"
            ),
            "The variety of life in a particular ecosystem or on Earth as a whole"
        ),
        PracticeQuestion(
            "What is extinction?",
            listOf(
                "The permanent disappearance of a species from the Earth",
                "The study of aquatic ecosystems",
                "The synthesis of biomolecules",
                "The production of new organisms"
            ),
            "The permanent disappearance of a species from the Earth"
        ),
        PracticeQuestion(
            "What is conservation biology?",
            listOf(
                "The scientific study of the preservation and management of biodiversity",
                "The production of new organisms",
                "The study of genes and heredity",
                "The classification of living things"
            ),
            "The scientific study of the preservation and management of biodiversity"
        )

    )
    val oMaths = listOf<PracticeQuestion>(

        PracticeQuestion("What is the smallest real number?", listOf("0", "1", "-1", "∞"), "0"),
        PracticeQuestion("Which of these is not a real number?", listOf("i", "3", "π", "e"), "i"),
        PracticeQuestion("What are the factors of 12?", listOf("1, 2, 3, 4, 6, 12", "1, 2, 4, 8, 12, 16", "1, 3, 5, 7, 9, 11", "2, 3, 5, 7, 11, 13"), "1, 2, 3, 4, 6, 12"),
        PracticeQuestion("What is the absolute value of -5?", listOf("-5", "0", "5", "undefined"), "5"),
        PracticeQuestion("What is the square root of 25?", listOf("5", "10", "25", "-5"), "5"),
        PracticeQuestion("What is the union of {1,2,3} and {2,3,4}?", listOf("{1,2,3}", "{2,3,4}", "{1,2,3,4}", "{1,4}"), "{1,2,3,4}"),
        PracticeQuestion("What is the intersection of {a,b,c,d} and {b,d,e,f}?", listOf("{b,d}", "{a,c,e,f}", "{b,d,e,f}", "{}"), "{b,d}"),
        PracticeQuestion("What is the complement of {1,2,3} in the universal set {0,1,2,3,4}?", listOf("{0,4}", "{1,2,3}", "{0,2,4}", "{1,3,4}"), "{0,4}"),
        PracticeQuestion("What is the difference of {a,b,c,d} and {b,d}?", listOf("{a,c}", "{b,c,d}", "{a,b,c,d}", "{}"), "{a,c}"),
        PracticeQuestion("What is a proper subset of {1,2,3}?", listOf("{1,2}", "{2,3}", "{1,2,3,4}", "{}"), "{1,2}")
        ,
        PracticeQuestion("What is the x-intercept of the graph y = 3x + 2?", listOf("-2", "0", "2", "undefined"), "-2"),
        PracticeQuestion("What is the slope of the graph passing through points (1,5) and (3,11)?", listOf("3", "2", "6", "4"), "3"),
        PracticeQuestion("If y varies inversely with x and y = 10 when x = 5, what is y when x = 8?", listOf("6.25", "12.8", "18.5", "20"), "6.25"),
        PracticeQuestion("The cost of 5 pens is $15. What is the cost of 15 pens?", listOf("$45", "$5", "$10", "$30"), "$45")
        ,
        PracticeQuestion("What is the value of x in the equation 3x + 5 = 14?", listOf("3", "4", "6", "9"), "3"),
        PracticeQuestion("What is the solution of the equation 2x - 1 = 7?", listOf("4", "3", "2", "10"), "4"),
        PracticeQuestion("What is the slope-intercept form of the equation of a line?", listOf("y = mx + b", "y = ax^2 + c", "y = ax + bx + c", "y = ab^x"), "y = mx + b"),
        PracticeQuestion("What is the area of a triangle with base 6 cm and height 8 cm?", listOf("24 sq cm", "12 sq cm", "48 sq cm", "36 sq cm"), "24 sq cm"),
        PracticeQuestion("What is the circumference of a circle with radius 5 cm?", listOf("31.4 cm", "15.7 cm", "78.5 cm", "25 cm"), "31.4 cm"),
        PracticeQuestion("What is the Pythagorean theorem?", listOf("a^2 + b^2 = c^2", "a^2 + b^2 + c^2 = d^2", "a + b + c = d", "a/b = c/d"), "a^2 + b^2 = c^2"),
        PracticeQuestion("What is the perimeter of a rectangle with length 10 cm and width 5 cm?", listOf("30 cm", "20 cm", "50 cm", "15 cm"), "30 cm"),
        PracticeQuestion("What is the volume of a cube with side length 4 cm?", listOf("64 cubic cm", "16 cubic cm", "32 cubic cm", "12 cubic cm"), "64 cubic cm"),
        PracticeQuestion("What is the formula for the area of a circle?", listOf("πr^2", "2πr", "πd", "4πr^2"), "πr^2"),
        PracticeQuestion("What is the sum of the angles in a triangle?", listOf("180 degrees", "90 degrees", "360 degrees", "270 degrees"), "180 degrees")
        ,
        PracticeQuestion("What is the magnitude of a vector with components (3,4)?", listOf("5", "7", "8", "10"), "5"),
        PracticeQuestion("What is the dot product of vectors (2,3) and (4,1)?", listOf("11", "14", "13", "9"), "11"),
        PracticeQuestion("What is the cross product of vectors (1,2,3) and (4,5,6)?", listOf("(-3, 6, -3)", "(3, -6, 3)", "(-3, -6, -3)", "(3, 6, -3)"), "(-3, 6, -3)"),
        PracticeQuestion("What is the determinant of the matrix [[3,5][2,4]]?", listOf("2", "6", "-2", "-6"), "2"),
        PracticeQuestion("What is the inverse of the matrix [[1,0][0,1]]?", listOf("[[1,0][0,1]]", "[[0,1][1,0]]", "[[-1,0][0,-1]]", "[[2,0][0,2]]"), "[[1,0][0,1]]"),
        PracticeQuestion("What is the product of matrices [[1,2][3,4]] and [[5,6][7,8]]?", listOf("[[19,22][43,50]]", "[[7,8][9,10]]", "[[11,12][13,14]]", "[[15,16][17,18]]"), "[[19,22][43,50]]"),
        PracticeQuestion("What is the rank of the matrix [[1,2,3][4,5,6][7,8,9]]?", listOf("2", "3", "1", "0"), "2"),
        PracticeQuestion("What is the trace of the matrix [[2,4,6][3,5,7][1,8,9]]?", listOf("16", "11", "23", "14"), "16"),
        PracticeQuestion("What is the eigenvalue of the matrix [[4,-1][2,3]]?", listOf("3", "4", "2", "-1"), "4"),
        PracticeQuestion("What is the eigenvector of the matrix [[2,-3][4,-1]] with eigenvalue 1?", listOf("[-1, -2]", "[2, 1]", "[-2, -1]", "[1, 2]"), "[-1, -2]")
        ,

        PracticeQuestion(
            "Financial Mathematics: If you borrow $500 at an interest rate of 10% per annum, how much interest will you pay after one year?",
            listOf("$45", "$50", "$55", "$60"),
            "$50"
        ),
        PracticeQuestion(
            "Financial Mathematics: What is the monthly payment required to pay off a loan of $1000 in 2 years with an interest rate of 5% per annum?",
            listOf("$43.03", "$45.56", "$48.09", "$50.62"),
            "$43.03"
        ),
        PracticeQuestion(
            "Financial Mathematics: What is the future value of a deposit of $2000 made today, if the annual interest rate is 8% compounded quarterly for 5 years?",
            listOf("$2,770.24", "$3,035.45", "$3,310.67", "$3,601.81"),
            "$3,310.67"
        ),
        PracticeQuestion(
            "Financial Mathematics: Suppose you invest $5000 today in a fund that earns 6% per annum compounded monthly. What will be the value of your investment after 5 years?",
            listOf("$6,839.63", "$7,523.59", "$8,275.94", "$9,105.16"),
            "$6,839.63"
        ),
        PracticeQuestion(
            "Financial Mathematics: A car dealership offers a 3-year financing plan with an annual interest rate of 7%. If you buy a car for $20,000, what is the monthly payment?",
            listOf("$613.46", "$642.87", "$672.28", "$701.69"),
            "$613.46"
        ),
        PracticeQuestion(
            "Measures and Mensuration: What is the area of a rectangle with length 8cm and width 5cm?",
            listOf("30cm²", "35cm²", "40cm²", "45cm²"),
            "40cm²"
        ),
        PracticeQuestion(
            "Measures and Mensuration: What is the perimeter of a square with sides of length 6cm?",
            listOf("18cm", "20cm", "22cm", "24cm"),
            "24cm"
        ),
        PracticeQuestion(
            "Measures and Mensuration: A cylindrical water tank has a radius of 5m and a height of 10m. What is its volume?",
            listOf("785m³", "1,570m³", "3,925m³", "7,850m³"),
            "785m³"
        ),
        PracticeQuestion(
            "Measures and Mensuration: What is the surface area of a cube with edges of length 3cm?",
            listOf("18cm²", "27cm²", "36cm²", "54cm²"),
            "54cm²"
        ),
        PracticeQuestion(
            "Measures and Mensuration: A triangular prism has a base of length 6cm and height 8cm. The prism is 10cm tall. What is its volume?",
            listOf("240cm³", "320cm³", "360cm³", "480cm³"),
            "240cm³"
        )
        ,
        PracticeQuestion(
            "Statistics: Which measure of central tendency is most affected by outliers in a dataset?",
            listOf("Mean", "Median", "Mode", "Range"),
            "Mean"
        ),
        PracticeQuestion(
            "Statistics: What is the formula for calculating standard deviation?",
            listOf("√(Σ(xi - x̄)²/n)", "Σ(xi - x̄)/n", "Σxi/n", "√Σxi/n"),
            "√(Σ(xi - x̄)²/n)"
        ),
        PracticeQuestion(
            "Statistics: What is the probability of rolling a 5 on a fair six-sided die?",
            listOf("1/6", "1/5", "1/4", "1/3"),
            "1/6"
        ),
        PracticeQuestion(
            "Statistics: What is the mode of the following dataset? {2, 3, 5, 5, 6, 7, 7, 8, 9}",
            listOf("5", "6", "7", "8"),
            "5"
        ),
        PracticeQuestion(
            "Statistics: In a class of 30 students, the mean score on a test was 75. If a student scored 90 on the same test, what is the new mean score?",
            listOf("75.5", "76", "76.5", "77"),
            "76"
        ),
        PracticeQuestion(
            "Trigonometry: What is the sine of an angle in a right triangle with adjacent side 3 and hypotenuse 5?",
            listOf("0.6", "0.8", "0.9", "1.0"),
            "0.6"
        ),
        PracticeQuestion(
            "Trigonometry: What is the tangent of an angle in a right triangle with opposite side 4 and adjacent side 3?",
            listOf("0.75", "0.8", "0.85", "0.9"),
            "0.75"
        ),
        PracticeQuestion(
            "Trigonometry: What is the value of cos(60°)?",
            listOf("0.5", "0.6", "0.7", "0.8"),
            "0.5"
        ),
        PracticeQuestion(
            "Trigonometry: What is the value of sin(30°)?",
            listOf("0.25", "0.5", "0.75", "1.0"),
            "0.5"
        ),
        PracticeQuestion(
            "Trigonometry: In a right triangle, if the hypotenuse is 10 and one acute angle is 30 degrees, what is the length of the opposite side?",
            listOf("5√3", "5", "10/√3", "10"),
            "5"
        )
        ,
        PracticeQuestion(
            "Transformation: What transformation will result in a reflection across the y-axis?",
            listOf("Translation", "Rotation", "Dilation", "Reflection across x-axis"),
            "Reflection across x-axis"
        ),
        PracticeQuestion(
            "Transformation: What transformation will result in a rotation of 90 degrees clockwise?",
            listOf("90 degrees counterclockwise", "180 degrees clockwise", "270 degrees counterclockwise", "Reflection across x-axis"),
            "270 degrees counterclockwise"
        ),
        PracticeQuestion(
            "Transformation: What transformation will result in a dilation with a scale factor of 2?",
            listOf("Translation", "Rotation", "Dilation with a scale factor of 1/2", "Reflection across y-axis"),
            "Dilation with a scale factor of 1/2"
        ),
        PracticeQuestion(
            "Transformation: What is the image of point (3,4) after a translation of (-2,5)?",
            listOf("(1,9)", "(5,-1)", "(1,-1)", "(5,9)"),
            "(1,9)"
        ),
        PracticeQuestion(
            "Transformation: What is the equation of a line that is perpendicular to y = 2x + 3 and passes through the point (1,-2)?",
            listOf("y = -1/2x - 3/2", "y = -2x - 1", "y = -1/2x + 1/2", "y = 2x - 1"),
            "y = -1/2x + 1/2"
        ),
        PracticeQuestion(
            "Probability: What is the probability of rolling two dice and getting a sum of 7?",
            listOf("1/6", "1/8", "1/12", "1/36"),
            "1/6"
        ),
        PracticeQuestion(
            "Probability: A jar contains 5 red marbles and 3 blue marbles. If one marble is randomly selected, what is the probability that it is red?",
            listOf("5/8", "3/8", "1/5", "2/5"),
            "5/8"
        ),
        PracticeQuestion(
            "Probability: What is the probability of flipping a coin three times and getting all heads?",
            listOf("1/2", "1/4", "1/6", "1/8"),
            "1/8"
        ),
        PracticeQuestion(
            "Probability: A bag contains 6 red balls and 4 green balls. If two balls are randomly selected without replacement, what is the probability that both balls are red?",
            listOf("3/7", "1/3", "1/2", "2/5"),
            "1/5"
        ),
        PracticeQuestion(
            "Probability: What is the probability of rolling a number less than 3 or greater than 5 on a fair six-sided die?",
            listOf("1/3", "1/2", "2/3", "3/4"),
            "1/3"
        )
    )
    val oEnglish = listOf<PracticeQuestion>(

        PracticeQuestion(
            "Jenny is always the first to volunteer whenever a new project comes up in class. What personality trait does Jenny exhibit?",
            listOf("Confidence", "Timidity", "Arrogance", "Laziness"),
            "Confidence"
        ),
        PracticeQuestion(
            "Alex always likes to be the center of attention and talk about himself. What personality trait does Alex exhibit?",
            listOf("Humility", "Narcissism", "Introversion", "Friendliness"),
            "Narcissism"
        ),
        PracticeQuestion(
            "Whenever they have a group assignment, John is usually the one who takes charge and delegates tasks. What personality trait does John exhibit?",
            listOf("Leadership", "Submissiveness", "Indecisiveness", "Aggression"),
            "Leadership"
        ),
        PracticeQuestion(
            "Samantha is always polite and courteous to everyone she meets. What personality trait does Samantha exhibit?",
            listOf("Kindness", "Cruelty", "Selfishness", "Dishonesty"),
            "Kindness"
        ),
        PracticeQuestion(
            "Every time the teacher asks a question, Charlie eagerly raises his hand to answer it. What personality trait does Charlie exhibit?",
            listOf("Curiosity", "Apathy", "Ignorance", "Boredom"),
            "Curiosity"
        ),
        PracticeQuestion(
            "Maria is always willing to lend a helping hand to anyone who needs it. What personality trait does Maria exhibit?",
            listOf("Generosity", "Stinginess", "Greed", "Deception"),
            "Generosity"
        ),
        PracticeQuestion(
            "Tom is always the life of the party, and loves to make people laugh. What personality trait does Tom exhibit?",
            listOf("Humor", "Seriousness", "Melancholy", "Pessimism"),
            "Humor"
        ),
        PracticeQuestion(
            "Whenever there is a disagreement, Sarah always tries to see things from the other person's perspective. What personality trait does Sarah exhibit?",
            listOf("Empathy", "Hostility", "Skepticism", "Distrust"),
            "Empathy"
        ),
        PracticeQuestion(
            "When faced with a difficult problem, David always takes the time to carefully think through all his options before making a decision. What personality trait does David exhibit?",
            listOf("Thoughtfulness", "Impulsiveness", "Carelessness", "Recklessness"),
            "Thoughtfulness"
        ),
        PracticeQuestion(
            "Lisa is always calm and composed even in stressful situations. What personality trait does Lisa exhibit?",
            listOf("Calmness", "Anxiety", "Fearfulness", "Nervousness"),
            "Calmness"
        )
        ,
        PracticeQuestion(
            "Samantha always looks on the bright side of things, even when everything seems to be going wrong. What type of attitude does Samantha exhibit?",
            listOf("Optimism", "Pessimism", "Realism", "Idealism"),
            "Optimism"
        ),
        PracticeQuestion(
            "John tends to focus on the negative aspects of situations and is quick to find fault in others. What type of attitude does John exhibit?",
            listOf("Negativity", "Positivity", "Neutrality", "Indifference"),
            "Negativity"
        ),
        PracticeQuestion(
            "Whenever he encounters a problem, Tom always believes that he can overcome it if he tries hard enough. What type of attitude does Tom exhibit?",
            listOf("Can-do attitude", "Defeatist attitude", "Cynical attitude", "Ambivalent attitude"),
            "Can-do attitude"
        ),
        PracticeQuestion(
            "Maria always approaches new experiences with enthusiasm and a sense of adventure. What type of attitude does Maria exhibit?",
            listOf("Adventurous attitude", "Boring attitude", "Uninterested attitude", "Apathetic attitude"),
            "Adventurous attitude"
        ),
        PracticeQuestion(
            "Charlie always views challenges as opportunities for growth and learning. What type of attitude does Charlie exhibit?",
            listOf("Growth mindset", "Fixed mindset", "Closed mindset", "Stagnant mindset"),
            "Growth mindset"
        ),
        PracticeQuestion(
            "When faced with a setback, David always keeps a positive outlook and looks for ways to turn the situation arounWhat type of attitude does David exhibit?",
            listOf("Resilient attitude", "Defeated attitude", "Despondent attitude", "Hopeless attitude"),
            "Resilient attitude"
        ),
        PracticeQuestion(
            "Lisa is always open to new ideas and perspectives, even if they differ from her own. What type of attitude does Lisa exhibit?",
            listOf("Open-minded attitude", "Close-minded attitude", "Stubborn attitude", "Inflexible attitude"),
            "Open-minded attitude"
        ),
        PracticeQuestion(
            "When dealing with obstacles, Sarah always perseveres and refuses to give up until she achieves her goals. What type of attitude does Sarah exhibit?",
            listOf("Determined attitude", "Defeated attitude", "Discouraged attitude", "Ambivalent attitude"),
            "Determined attitude"
        ),
        PracticeQuestion(
            "Alex always approaches his work with a sense of dedication and diligence, going above and beyond what is expecteWhat type of attitude does Alex exhibit?",
            listOf("Work ethic", "Laziness", "Apathy", "Indifference"),
            "Work ethic"
        ),
        PracticeQuestion(
            "Whenever someone makes a mistake, Jenny always gives them the benefit of the doubt and assumes it was an honest error. What type of attitude does Jenny exhibit?",
            listOf("Forgiving attitude", "Vengeful attitude", "Angry attitude", "Bitter attitude"),
            "Forgiving attitude"
        )
        ,
        PracticeQuestion(
            "Whenever someone enters the room, Samantha always greets them with a smile and a warm hello. What type of manner does Samantha exhibit?",
            listOf("Politeness", "Rudeness", "Arrogance", "Disrespect"),
            "Politeness"
        ),
        PracticeQuestion(
            "John always waits his turn to speak and listens attentively when others are talking. What type of manner does John exhibit?",
            listOf("Respectful listening", "Interrupting", "Talking over others", "Impatience"),
            "Respectful listening"
        ),
        PracticeQuestion(
            "Whenever they have a meal together, Tom always waits for everyone to be served before he starts eating. What type of manner does Tom exhibit?",
            listOf("Table manners", "Impolite dining", "Eating with mouth open", "Chewing loudly"),
            "Table manners"
        ),
        PracticeQuestion(
            "Maria always says 'please' and 'thank you' when making requests or receiving something from others. What type of manner does Maria exhibit?",
            listOf("Gratefulness", "Entitlement", "Demanding behavior", "Arrogance"),
            "Gratefulness"
        ),
        PracticeQuestion(
            "Charlie always holds the door open for others and helps those who need assistance. What type of manner does Charlie exhibit?",
            listOf("Courtesy", "Discourtesy", "Selfishness", "Indifference"),
            "Courtesy"
        ),
        PracticeQuestion(
            "When meeting someone new, David always introduces himself and shakes hands with the person. What type of manner does David exhibit?",
            listOf("Etiquette", "Inappropriate behavior", "Insensitivity", "Hostility"),
            "Etiquette"
        ),
        PracticeQuestion(
            "Lisa always apologizes when she has made a mistake or caused inconvenience to others. What type of manner does Lisa exhibit?",
            listOf("Apologizing", "Blaming others", "Defensiveness", "Excuses"),
            "Apologizing"
        ),
        PracticeQuestion(
            "When someone is speaking, Sarah always maintains eye contact and nods her head to show she is attentive. What type of manner does Sarah exhibit?",
            listOf("Active listening", "Distraction", "Ignoring others", "Impatience"),
            "Active listening"
        ),
        PracticeQuestion(
            "Alex always arrives on time for appointments and meetings. What type of manner does Alex exhibit?",
            listOf("Punctuality", "Tardiness", "Procrastination", "Disrespect"),
            "Punctuality"
        ),
        PracticeQuestion(
            "Whenever Jenny disagrees with someone, she expresses her opinion politely and respectfully. What type of manner does Jenny exhibit?",
            listOf("Civil discourse", "Argumentative behavior", "Aggressiveness", "Hostility"),
            "Civil discourse"
        )
        ,
        PracticeQuestion(
            "Samantha is waiting in line at the grocery store when someone cuts in front of her. What type of situation is Samantha experiencing?",
            listOf("Line-cutting", "Crowding", "Impatience", "Traffic"),
            "Line-cutting"
        ),
        PracticeQuestion(
            "John is feeling overwhelmed with homework and extracurricular activities. What type of situation is John experiencing?",
            listOf("Overload", "Boredom", "Underload", "Relaxation"),
            "Overload"
        ),
        PracticeQuestion(
            "Tom is driving to an important job interview when he gets lost and can't find the location. What type of situation is Tom experiencing?",
            listOf("Getting lost", "Road rage", "Traffic jam", "Car accident"),
            "Getting lost"
        ),
        PracticeQuestion(
            "Maria is attending a social event where she doesn't know anyone else. What type of situation is Maria experiencing?",
            listOf("Social isolation", "Networking", "Crowding", "Intimacy"),
            "Social isolation"
        ),
        PracticeQuestion(
            "Charlie is at a concert where the music is so loud he can't hear himself think. What type of situation is Charlie experiencing?",
            listOf("Noise pollution", "Silence", "Peacefulness", "Tranquility"),
            "Noise pollution"
        ),
        PracticeQuestion(
            "When studying for an upcoming test, David realizes he doesn't understand a key concept. What type of situation is David experiencing?",
            listOf("Academic difficulty", "Academic success", "Academic boredom", "Academic dishonesty"),
            "Academic difficulty"
        ),
        PracticeQuestion(
            "Lisa is on a crowded bus during rush hour, with people pushing and shoving to get on. What type of situation is Lisa experiencing?",
            listOf("Crowding", "Personal space invasion", "Social distancing", "Isolation"),
            "Crowding"
        ),
        PracticeQuestion(
            "When attending a family gathering, Sarah gets into an argument with her cousin about politics. What type of situation is Sarah experiencing?",
            listOf("Conflict", "Harmony", "Agreement", "Compromise"),
            "Conflict"
        ),
        PracticeQuestion(
            "Alex is hiking in the woods when he encounters a bear. What type of situation is Alex experiencing?",
            listOf("Danger", "Safety", "Adventurous", "Tranquil"),
            "Danger"
        ),
        PracticeQuestion(
            "Jenny is stuck in traffic on her way to an important meeting. What type of situation is Jenny experiencing?",
            listOf("Traffic jam", "Smooth traffic", "Open road", "Pedestrian crossing"),
            "Traffic jam"
        )

        ,
        PracticeQuestion("What's your name?", listOf("My name is...", "I go by...", "People call me...", "You can call me..."), "My name is..."),
        PracticeQuestion("Where are you from?", listOf("I'm from...", "I come from...", "I hail from...", "I was born in..."), "I'm from..."),
        PracticeQuestion("How old are you?", listOf("I am...", "My age is...", "I'm...", "I turned... recently."), "I'm..."),
        PracticeQuestion("What do you do for a living?", listOf("I am a...", "I work as a...", "I make a living by...", "I am employed as a..."), "I am a..."),
        PracticeQuestion("Do you have any siblings?", listOf("Yes, I have...", "No, I don't have...", "I have...", "I come from a family of..."), "Yes, I have..."),
        PracticeQuestion("What's your favorite hobby?", listOf("I enjoy...", "In my free time, I like to...", "My favorite pastime is...", "I spend my leisure time..."), "I enjoy..."),
        PracticeQuestion("Have you ever traveled outside of your country?", listOf("Yes, I have been to...", "No, I haven't left...", "I've visited...", "I've had the opportunity to see..."), "Yes, I have been to..."),
        PracticeQuestion("What's your favorite color?", listOf("My favorite color is...", "I like...", "The color I prefer is...", "I am drawn to..."), "My favorite color is..."),
        PracticeQuestion("What's your favorite food?", listOf("I enjoy eating...", "My favorite dish is...", "I'm partial to...", "If I had to choose, it would be..."), "I enjoy eating..."),
        PracticeQuestion("What's your favorite music genre?", listOf("I like listening to...", "My preferred style of music is...", "The kind of music I enjoy is...", "I'm into..."), "I like listening to...")
        ,
        PracticeQuestion("How do you say hello in English?", listOf("Hello", "Hi", "Hey", "Good day"), "Hello"),
        PracticeQuestion("What's the formal way to greet someone in English?", listOf("Good morning/afternoon/evening, sir/madam", "Hello there", "How are you?", "Nice to meet you"), "Good morning/afternoon/evening, sir/madam"),
        PracticeQuestion("What's an informal way to greet someone in English?", listOf("Hi", "Hey", "What's up?", "Yo!"), "Hi"),
        PracticeQuestion("How do you respond when someone greets you with 'hello'?", listOf("Hello", "Hi", "Goodbye", "How are you?"), "Hello"),
        PracticeQuestion("How do you ask someone how they're doing?", listOf("How are you?", "What's up?", "How's it going?", "What's new?"), "How are you?"),
        PracticeQuestion("What's an appropriate response to 'how are you?'", listOf("I'm fine, thank you. And you?", "I'm good, what about you?", "Not too bad, and you?", "Can't complain, you?"), "I'm fine, thank you. And you?"),
        PracticeQuestion("What's a common way to say goodbye in English?", listOf("Goodbye", "See you later", "Take care", "Bye-bye"), "Goodbye"),
        PracticeQuestion("What's a more casual way to say goodbye in English?", listOf("Bye", "Later", "Peace out", "Catch you later"), "Bye"),
        PracticeQuestion("What's an appropriate response to 'goodbye'?", listOf("Goodbye", "See you later", "Take care", "Bye-bye"), "Goodbye"),
        PracticeQuestion("What's a polite way to end a conversation in English?", listOf("It was nice talking to you. Take care.", "I gotta go now. See you later.", "Let's catch up soon. Goodbye!", "Talk to you later!"), "It was nice talking to you. Take care.")
        ,
        PracticeQuestion("How do you ask for something politely in English?", listOf("Could I please have...", "Give me...", "I want...", "Get me..."), "Could I please have..."),
        PracticeQuestion("What's a polite way to ask for help in English?", listOf("Could you please help me with...", "I need you to help me...", "Give me a hand with...", "Can you do this for me?"), "Could you please help me with..."),
        PracticeQuestion("What's an appropriate way to ask someone to repeat something in English?", listOf("Sorry, could you repeat that?", "What did you say?", "Huh?", "Can you say it again?"), "Sorry, could you repeat that?"),
        PracticeQuestion("What's a polite way to ask someone to wait in English?", listOf("Just a moment, please.", "Hold on.", "Wait!", "Be patient."), "Just a moment, please."),
        PracticeQuestion("What's an appropriate way to ask someone to give you some privacy in English?", listOf("Could you give me some privacy, please?", "Leave me alone!", "Stay away from me!", "Don't come near me!"), "Could you give me some privacy, please?"),
        PracticeQuestion("How do you ask someone to do something for you in English?", listOf("Would you mind doing...", "Do this for me!", "I'm asking you to...", "You have to do..."), "Would you mind doing..."),
        PracticeQuestion("What's a polite way to decline a request in English?", listOf("I'm sorry, but I can't...", "No way!", "Not a chance!", "Get lost!"), "I'm sorry, but I can't..."),
        PracticeQuestion("How do you ask for permission to do something in English?", listOf("Can I please...", "I'm going to do...", "Is it okay if I...", "I don't need permission to..."), "Can I please..."),
        PracticeQuestion("What's a polite way to ask someone to stop doing something in English?", listOf("Could you please stop...", "Quit it!", "Cut it out!", "Stop it, right now!"), "Could you please stop..."),
        PracticeQuestion("How do you express gratitude in English after someone has fulfilled your request?", listOf("Thank you so much!", "It's about time!", "Finally!", "Thanks, I guess..."), "Thank you so much!")
        ,
        PracticeQuestion("What's a polite way to make a complaint in English?", listOf("Excuse me, could I speak to a manager?", "This is unacceptable!", "I demand a refund!", "What the hell is this?"), "Excuse me, could I speak to a manager?"),
        PracticeQuestion("How do you apologize for a mistake in English?", listOf("I'm sorry, that was my fault.", "It wasn't my fault.", "Blame someone else!", "I don't care!"), "I'm sorry, that was my fault."),
        PracticeQuestion("What's a polite way to give a compliment in English?", listOf("You look great today!", "Have you lost weight?", "You're not as incompetent as I thought!", "Nice try, but you failed!"), "You look great today!"),
        PracticeQuestion("How do you apologize sincerely in English?", listOf("I deeply apologize for what I've done.", "It wasn't my fault at all.", "I'm sorry if you were offended by what I said.", "Stop complaining!"), "I deeply apologize for what I've done."),
        PracticeQuestion("What's an appropriate way to express gratitude in English?", listOf("Thank you so much, I really appreciate it!", "Big deal. So what?", "You call that a favor?", "Why should I thank you?"), "Thank you so much, I really appreciate it!"),
        PracticeQuestion("What's a polite way to accept a compliment in English?", listOf("Thank you, that's very kind of you to say.", "Yeah, I know I'm great!", "Obviously, I deserve it!", "It's about time someone noticed!"), "Thank you, that's very kind of you to say."),
        PracticeQuestion("What's a polite way to reject a compliment in English?", listOf("Thank you, but I don't think I deserve that.", "You're just saying that to be nice.", "Are you kidding me?", "That's not really a compliment."), "Thank you, but I don't think I deserve that."),
        PracticeQuestion("How do you express dissatisfaction when making a complaint in English?", listOf("I'm sorry, but this is not what I was expecting.", "This is the worst service I've ever had!", "I'm never coming back here again!", "I hate this place!"), "I'm sorry, but this is not what I was expecting."),
        PracticeQuestion("What's a polite way to make an apology in English?", listOf("I am truly sorry for my behavior.", "It wasn't really my fault.", "I'm sorry if you were hurt.", "Get over it!"), "I am truly sorry for my behavior."),
        PracticeQuestion("What's an appropriate way to compliment someone's work in English?", listOf("Your work is amazing, keep it up!", "I could have done better myself!", "Your work is good, but mine is better!", "I don't care about your work!"), "Your work is amazing, keep it up!")
        ,
        PracticeQuestion("What's an appropriate way to start an announcement in English?", listOf("Ladies and gentlemen,", "Listen up, people!", "Hey, everyone!", "Yo, what's up?"), "Ladies and gentlemen,"),
        PracticeQuestion("What's an appropriate way to make an announcement in English?", listOf("I'm pleased to announce that...", "This is really important, so listen up!", "You're not going to believe this...", "I have bad news."), "I'm pleased to announce that..."),
        PracticeQuestion("How do you end an announcement politely in English?", listOf("Thank you for your attention.", "That's all, folks!", "I'm done here, you can go now.", "Get lost!"), "Thank you for your attention."),
        PracticeQuestion("What's a polite way to inform people of a change in plans in English?", listOf("I'm sorry to inform you that there's been a change of plans.", "It's not my fault, blame someone else!", "I don't care what you think, this is happening!", "Suck it up!"), "I'm sorry to inform you that there's been a change of plans."),
        PracticeQuestion("What's a formal way to announce the start of an event in English?", listOf("I hereby declare this event open.", "Let's get this party started!", "Time to get lit!", "Let's do this!"), "I hereby declare this event open."),
        PracticeQuestion("What's a polite way to remind people about an upcoming event in English?", listOf("Just a friendly reminder that the event is taking place soon.", "If you forget about this, you'll regret it!", "Don't miss out on the fun!", "Why bother showing up?"), "Just a friendly reminder that the event is taking place soon."),
        PracticeQuestion("What's a polite way to inform people about a cancellation in English?", listOf("I'm sorry to inform you that the event has been cancelled.", "Tough luck, deal with it!", "You were never going to come anyway!", "It's not my problem."), "I'm sorry to inform you that the event has been cancelled."),
        PracticeQuestion("How do you make an announcement in English that something is starting in a few minutes?", listOf("We will be starting in just a few minutes.", "Hurry up and get ready, we're starting soon!", "Let's go already!", "Why are you all so slow?"), "We will be starting in just a few minutes."),
        PracticeQuestion("What's a formal way to announce the end of a speech or presentation in English?", listOf("Thank you for your attention, that concludes my speech/presentation.", "That's all, folks!", "I'm done here, you can go now.", "Get lost!"), "Thank you for your attention, that concludes my speech/presentation."),
        PracticeQuestion("What's an appropriate way to make an announcement about a new initiative in English?", listOf("Introducing our new initiative...", "This is something you won't want to miss!", "This is the best thing ever!", "Who cares about this stuff?"), "Introducing our new initiative...")
        ,
        PracticeQuestion("What's a polite way to invite someone to an event in English?", listOf("Would you like to come to...", "You have to come to...", "I'm inviting you to...", "Why don't you come to..."), "Would you like to come to..."),
        PracticeQuestion("How do you ask someone if they're available for an event in English?", listOf("Are you free on...", "What are you doing on...", "Can you make it to...", "You better clear your schedule for..."), "Are you free on..."),
        PracticeQuestion("What's a polite way to decline an invitation in English?", listOf("Thank you for the invitation, but I won't be able to make it.", "No way, I hate that kind of thing!", "I don't have time for this.", "I'll consider it, but probably not."), "Thank you for the invitation, but I won't be able to make it."),
        PracticeQuestion("What's an appropriate way to invite someone to a formal event in English?", listOf("We would be honored if you could attend...", "You better show up to this one!", "It's mandatory that you come to...", "Who cares about this stuff?"), "We would be honored if you could attend..."),
        PracticeQuestion("How do you make an RSVP request in English?", listOf("Please let us know if you can attend by...", "Just show up if you want to come.", "Don't even bother letting us know.", "We don't care if you show up or not."), "Please let us know if you can attend by..."),
        PracticeQuestion("What's an appropriate way to invite someone to a casual event in English?", listOf("Wanna hang out with us?", "Come party with us!", "Get ready to have some fun!", "I don't care if you come or not."), "Wanna hang out with us?"),
        PracticeQuestion("What's a polite way to accept an invitation in English?", listOf("Thank you for inviting me, I would love to come.", "Of course I'll come, it sounds like fun!", "I'll consider it, let me get back to you.", "I'm not coming, sorry."), "Thank you for inviting me, I would love to come."),
        PracticeQuestion("How do you invite someone to a dinner party in English?", listOf("Would you like to join us for dinner?", "We're having a dinner party, you should come!", "You better bring something good if you're coming to dinner!", "Who cares about dinner parties?"), "Would you like to join us for dinner?"),
        PracticeQuestion("What's a polite way to invite someone to a birthday party in English?", listOf("It's my/our birthday soon, would you like to come celebrate with us?", "Come to our birthday party and have some cake!", "We're having a party, you should come!", "Who cares about birthdays?"), "It's my/our birthday soon, would you like to come celebrate with us?"),
        PracticeQuestion("What's a formal way to invite someone to a business event in English?", listOf("We would like to invite you to our upcoming business event...", "It's mandatory that you attend our business event!", "You better show up if you want to make a good impression.", "Who cares about business events?"), "We would like to invite you to our upcoming business event...")

    )
}







