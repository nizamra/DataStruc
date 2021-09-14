// Annotations
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
// Assertions
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

@Before
public void setUp() { }
@Test
public void testCase() { }
@After
public void tearDown() { }

@Test(timeout = TIMEOUT, expected = IllegalArgumentException.class)
public void exceptionallyTimedTestCase() { }